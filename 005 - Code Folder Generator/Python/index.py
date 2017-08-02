import pathlib
import os
from datetime import datetime, timedelta

folders = []
current = 0
current_name = ""

for root, dirs, files in os.walk("../../", topdown=False):
    for name in dirs:
        if root == "../../": folders.append(name)

for folder in folders:
    if folder != ".git":
        if int(folder.split(' ')[0]) > current:
            current = int(folder.split(' ')[0])
            current_name = folder

nxt = current + 1
zeros_len = 3 - len(str(nxt))
zeros = ""
for i in range(0, zeros_len): zeros+="0"

proj_name = input("What's the project name? \n")
pathlib.Path('../../' + zeros + str(nxt) + " - " + proj_name).mkdir(parents=True, exist_ok=True)
pathlib.Path('../../' + zeros + str(nxt) + " - " + proj_name + "/java").mkdir(parents=True, exist_ok=True)
pathlib.Path('../../' + zeros + str(nxt) + " - " + proj_name + "/Python").mkdir(parents=True, exist_ok=True)
pathlib.Path('../../' + zeros + str(nxt) + " - " + proj_name + "/Javascript").mkdir(parents=True, exist_ok=True)

old_date = ""

old_readme = open('../../' + current_name + '/README.md', 'r')
for i, line in enumerate(old_readme):
    if i == 1:
        old_date = line.split(' ')[1]

old_date = datetime.strptime(old_date.replace('\n', ''), '%d/%m/%y')
new_date = old_date + timedelta(days=1)

proj_desc = input("What's the project description? \n")
readme = open('../../' + zeros + str(nxt) + " - " + proj_name + '/README.md', 'w')
readme.write('#' + zeros + str(nxt) + " - " + proj_name + "\n")
readme.write('> ' + new_date.strftime('%d/%m/%y') + "\n")
readme.write("\n")
readme.write(proj_desc + "\n")
readme.write("\n")
readme.write('- [ ] Java' + "\n")
readme.write('- [ ] Python' + "\n")
readme.write('- [ ] Javascript' + "\n")

readme.close()
