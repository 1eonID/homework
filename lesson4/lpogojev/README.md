```sh
$ git clone git@github.com:1eonID/homework.git
Клонирование в «homework»…
Enter passphrase for key '/home/Leader/.ssh/id_rsa':
Enter passphrase for key '/home/Leader/.ssh/id_rsa':
remote: Counting objects: 54, done.
remote: Total 54 (delta 0), reused 0 (delta 0), pack-reused 54
Получение объектов: 100% (54/54), 8.36 KiB | 0 bytes/s, готово.
Определение изменений: 100% (7/7), готово.
```
```sh
$ ls -la
итого 4
drwxr-xr-x+ 1 Leader None 0 апр 24 17:10 .
drwxr-xr-x+ 1 Leader None 0 апр 24 17:09 ..
drwxr-xr-x+ 1 Leader None 0 апр 24 17:10 homework
```
```sh
$ cd homework/
```
```sh
$ git init
Переинициализирован существующий репозиторий Git в /home/Leader/Homework/homework/.git/
```
```sh
$ mkdir lesson1-3
```
```sh
$ mv lpogojev/ lesson1-3/
```
```sh
$ git rm lpogojev/README.md lpogojev/manifest.txt lpogojev/src/SimpleMain.java
rm 'lpogojev/README.md'
rm 'lpogojev/manifest.txt'
rm 'lpogojev/src/SimpleMain.java'
```
```sh
$ git add lesson1-3/
```
```sh
$ git commit -m "Replace homework from 1-3 lessons to new directory"
[master 9234ff1] Replace homework from 1-3 lessons to new directory
 3 files changed, 0 insertions(+), 0 deletions(-)
 rename {lpogojev => lesson1-3/lpogojev}/README.md (100%)
 rename {lpogojev => lesson1-3/lpogojev}/manifest.txt (100%)
 rename {lpogojev => lesson1-3/lpogojev}/src/SimpleMain.java (100%)
```
```sh
$ mkdir lesson4
```
```sh
$ cd lesson4/
```
```sh
$ mkdir lpogojev
```
```sh
$ cd lpogojev/
```
```sh
$ mkdir src
```
```sh
$ mkdir out
```
```sh
$ touch README.md
```
```sh
$ git add lesson4/lpogojev/README.md
```
```sh
$ git status
На ветке master
Ваша ветка опережает «origin/master» на 1 коммит.
  (используйте «git push», чтобы опубликовать ваши локальные коммиты)
Изменения, которые будут включены в коммит:
  (используйте «git reset HEAD <файл>…», чтобы убрать из индекса)

        новый файл:    lesson4/lpogojev/README.md

```
```sh
$ git commit -m "Create directory for lesson 4 and create README.md file"
[master c7b7c6f] Create directory for lesson 4 and create README.md file
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 lesson4/lpogojev/README.md
```
```sh
$ touch lesson4/lpogojev/src/FirstTask.java lesson4/lpogojev/src/SecondTask.java lesson4/lpogojev/src/ThirdTask.java lesson4/lpogojev/src/FourthTask.java
```
```sh
$ git status
На ветке master
Ваша ветка опережает «origin/master» на 2 коммита.
  (используйте «git push», чтобы опубликовать ваши локальные коммиты)
Неотслеживаемые файлы:
  (используйте «git add <файл>…», чтобы добавить в то, что будет включено в коммит)

        lesson4/lpogojev/src/

ничего не добавлено в коммит, но есть неотслеживаемые файлы (используйте «git add», чтобы отслеживать их)
```
```sh
$ git add lesson4/lpogojev/src/FirstTask.java lesson4/lpogojev/src/SecondTask.java  lesson4/lpogojev/src/ThirdTask.java lesson4/lpogojev/src/FourthTask.java
```
```sh
$ git commit -m "Create 4 java files in directory src"
[master 3166f45] Create 4 java files in directory src
 4 files changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 lesson4/lpogojev/src/FirstTask.java
 create mode 100644 lesson4/lpogojev/src/FourthTask.java
 create mode 100644 lesson4/lpogojev/src/SecondTask.java
 create mode 100644 lesson4/lpogojev/src/ThirdTask.java
```
```sh
$ nano lesson4/lpogojev/src/FirstTask.java
```
```sh
$ git add lesson4/lpogojev/src/FirstTask.java
```
```sh
$ git commit -m "Solved the first task"
[master 2b94e5f] Solved the first task
 1 file changed, 12 insertions(+)
```
```sh
$ nano lesson4/lpogojev/src/SecondTask.java
```
```sh
$ git add lesson4/lpogojev/src/SecondTask.java
```
```sh
$ git commit -m "Solved the second task"
[master 58cee43] Solved the second task
 1 file changed, 22 insertions(+)
```
```sh
$ nano lesson4/lpogojev/src/ThirdTask.java
```
```sh
$ git add lesson4/lpogojev/src/ThirdTask.java
```
```sh
$ git commit -m "Solved the third task"
[master 4f02524] Solved the third task
 1 file changed, 19 insertions(+)
```
```sh
$ nano lesson4/lpogojev/src/FourthTask.java
```
```sh
$ git add lesson4/lpogojev/src/FourthTask.java
```
```sh
$ git commit -m "Solved the fourth task"
[master 154e864] Solved the fourth task
 1 file changed, 14 insertions(+)
```
```sh
$ javac -d out/ src/FirstTask.java && java -cp out/ FirstTask
99
33.0
Some string
```
```sh
$ javac -d out/ src/SecondTask.java && java -cp out/ SecondTask
*****
*****
*****
*****
*****
```
```sh
$ javac -d out/ src/ThirdTask.java && java -cp out/ ThirdTask
2001 - not a leap year.
2002 - not a leap year.
2003 - not a leap year.
2004 - leap year.
2005 - not a leap year.
2006 - not a leap year.
2007 - not a leap year.
2008 - leap year.
2009 - not a leap year.
2010 - not a leap year.
2011 - not a leap year.
2012 - leap year.
2013 - not a leap year.
2014 - not a leap year.
2015 - not a leap year.
2016 - leap year.
2017 - not a leap year.
```
```sh
$ javac -d out/ src/FourthTask.java && java -cp out/ FourthTask
It seems that I'm here forever
It seems that I'm here forever
It seems that I'm here forever
It seems that I'm here forever
It seems that I'm here forever
```
