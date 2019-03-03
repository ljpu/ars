# -*- coding: utf-8 -*-
# BeautifulSoup docs: https://www.crummy.com/software/BeautifulSoup/bs4/doc/#searching-the-tree
# export PYTHONPATH=".." to run this script
# libraries
import logging
import os
from urllib.request import urlopen

from bs4 import BeautifulSoup
from peewee import *

database = MySQLDatabase(os.getenv('DB_NAME', 'ars'), user=os.getenv('DB_USR', 'root'), passwd=os.getenv('DB_PWD', 'root'))


class BaseModel(Model):
    class Meta:
        database = database


class Port(BaseModel):
    code = IntegerField(unique=True)
    cstr = CharField()
    name = CharField()
    region = CharField()

    class Meta:
        db_table = 'ports'


Port.drop_table(True)
Port.create_table(True)

logging.basicConfig(filename='.python.log', level=logging.WARNING)
POEs = 'http://www.international.gc.ca/controls-controles/systems-systemes/prd-dpe/appendix-b_3-annexe.aspx?lang=eng'
page = BeautifulSoup(urlopen(POEs), 'html.parser')

for region in page.find_all('h5', class_=""):
    print('## ' + region.text)
    dl = region.next_sibling
    for li in dl.find_all(['dt', 'dd']):
        lival = li.text.split(':')[1].strip()
        if li.name == 'dt':
            port = lival
        if li.name == 'dd':
            code = lival
            port = {
                'code': code,
                'cstr': code,
                'name': port,
                'region': region.text,
            }
            Port.insert(**port).execute()
            print(port)
