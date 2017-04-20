18:54:04-java4@Class2-4:~$ git clone git@github.com:1eonID/homework.git
fatal: целевой путь «homework» уже существует и не является пустым каталогом.
19:03:34-java4@Class2-4:~$ rm -rf homework/
19:04:10-java4@Class2-4:~$ git clone git@github.com:1eonID/homework.git
Клонирование в «homework»…
Enter passphrase for key '/home/java4/.ssh/id_rsa': 
Enter passphrase for key '/home/java4/.ssh/id_rsa': 
remote: Counting objects: 32, done.
remote: Total 32 (delta 0), reused 0 (delta 0), pack-reused 32
Получение объектов: 100% (32/32), готово.
Определение изменений: 100% (1/1), готово.
Проверка соединения… готово.
19:04:22-java4@Class2-4:~$ cd homework/
19:04:29-java4@Class2-4:~/homework$ ll
итого 20
drwxrwxr-x  4 java4 java4 4096 Апр 20 19:04 ./
drwxr-xr-x 26 java4 java4 4096 Апр 20 19:04 ../
drwxrwxr-x  8 java4 java4 4096 Апр 20 19:04 .git/
-rw-rw-r--  1 java4 java4   23 Апр 20 19:04 .gitignore
drwxrwxr-x  3 java4 java4 4096 Апр 20 19:04 lpogojev/
19:04:33-java4@Class2-4:~/homework$ git init
Реинициализация существующего репозиторий Git в /home/java4/homework/.git/
19:04:39-java4@Class2-4:~/homework$ rm -rf lpogojev/
19:05:55-java4@Class2-4:~/homework$ mkdir lpogojev
19:06:08-java4@Class2-4:~/homework$ mkdir lpogojev/src
19:06:30-java4@Class2-4:~/homework$ mkdir lpogojev/out
19:06:35-java4@Class2-4:~/homework$ ll *
итого 16
drwxrwxr-x 4 java4 java4 4096 Апр 20 19:06 ./
drwxrwxr-x 4 java4 java4 4096 Апр 20 19:06 ../
drwxrwxr-x 2 java4 java4 4096 Апр 20 19:06 out/
drwxrwxr-x 2 java4 java4 4096 Апр 20 19:06 src/
19:06:38-java4@Class2-4:~/homework$ touch lpogojev/README.md
19:07:20-java4@Class2-4:~/homework$ ga lpogojev/README.md 
ga: команда не найдена
19:07:30-java4@Class2-4:~/homework$ git add lpogojev/README.md 
19:07:37-java4@Class2-4:~/homework$ git commit -m "Create README.md file"
[master fbdc5c0] Create README.md file
 1 file changed, 1 deletion(-)
19:08:00-java4@Class2-4:~/homework$ touch lpogojev/src/SimpleMain.java
19:08:35-java4@Class2-4:~/homework$ git add lpogojev/src/SimpleMain.java 
19:08:48-java4@Class2-4:~/homework$ git commit -m "Create SimpleMain.java file"
[master 208c8be] Create SimpleMain.java file
 1 file changed, 6 deletions(-)
19:09:01-java4@Class2-4:~/homework$ atom lpogojev/src/SimpleMain.java 
19:09:18-java4@Class2-4:~/homework$ cat lpogojev/src/SimpleMain.java 
public class SimpleMain {
  public static void main(String[] args) {
    // Here will be cool artifitial intelligence algorithm :)
    System.out.println("Hello again... worm!");
  }
}
19:10:22-java4@Class2-4:~/homework$ git add lpogojev/src/SimpleMain.java       
19:10:32-java4@Class2-4:~/homework$ git commit -m "Edit SimpleMain.java file"      
[master 1bff79d] Edit SimpleMain.java file
 1 file changed, 6 insertions(+)
19:10:44-java4@Class2-4:~/homework$ javac -d lpogojev/out lpogojev/src/SimpleMain.java 
19:11:29-java4@Class2-4:~/homework$ java -cp lpogojev/out/ SimpleMain 
Hello again... worm!
19:11:50-java4@Class2-4:~/homework$ git commit -m "Compile SimpleMain.java file and run SimpleMain.class file"
На ветке master
Ваша ветка опережает «origin/master» на 3 коммита.
  (используйте «git push», чтобы опубликовать ваши локальные коммиты)
Изменения, которые не в индексе для коммита:
        удалено:       lpogojev/CommandHistory.txt
        удалено:       lpogojev/manifest.txt

нет изменений добавленных для коммита
19:12:55-java4@Class2-4:~/homework$ jar -cvf app.jar -C lpogojev/out/ .
added manifest
adding: SimpleMain.class(in = 434) (out= 298)(deflated 31%)
19:14:10-java4@Class2-4:~/homework$ java -jar app.jar 
no main manifest attribute, in app.jar
19:14:27-java4@Class2-4:~/homework$ java -cp app.jar SimpleMain 
Hello again... worm!
19:14:37-java4@Class2-4:~/homework$ touch lpogojev/manifest.txt
19:14:58-java4@Class2-4:~/homework$ nano lpogojev/manifest.txt 
19:15:42-java4@Class2-4:~/homework$ git add lpogojev/manifest.txt 
19:16:56-java4@Class2-4:~/homework$ git commit -m "Create manifest.txt file"                   На ветке master
Ваша ветка опережает «origin/master» на 3 коммита.
  (используйте «git push», чтобы опубликовать ваши локальные коммиты)
Изменения, которые не в индексе для коммита:
        удалено:       lpogojev/CommandHistory.txt

нет изменений добавленных для коммита
19:17:26-java4@Class2-4:~/homework$ cat lpogojev/manifest.txt 
Main-Class: SimpleMain
19:17:48-java4@Class2-4:~/homework$ jar -cvmf app.jar lpogojev/manifest.txt -C lpogojev/out/ .
java.io.IOException: line too long
        at java.util.jar.Attributes.read(Attributes.java:379)
        at java.util.jar.Manifest.read(Manifest.java:199)
        at java.util.jar.Manifest.<init>(Manifest.java:69)
        at sun.tools.jar.Main.run(Main.java:176)
        at sun.tools.jar.Main.main(Main.java:1288)
19:18:57-java4@Class2-4:~/homework$ nano lpogojev/manifest.txt                                
19:20:18-java4@Class2-4:~/homework$ jar -cvfm app.jar lpogojev/manifest.txt -C lpogojev/out/ . 
added manifest
adding: SimpleMain.class(in = 434) (out= 298)(deflated 31%)
19:20:51-java4@Class2-4:~/homework$ java -jar app.jar 
Hello again... worm!
19:20:59-java4@Class2-4:~/homework$ git st
На ветке master
Ваша ветка опережает «origin/master» на 3 коммита.
  (используйте «git push», чтобы опубликовать ваши локальные коммиты)
Изменения, которые не в индексе для коммита:
  (используйте «git add/rm <файл>…», чтобы добавить или удалить файл из индекса)
  (используйте «git checkout -- <файл>…», чтобы отменить изменения
   в рабочем каталоге)

        удалено:       lpogojev/CommandHistory.txt

нет изменений добавленных для коммита
(используйте «git add» и/или «git commit -a»)
19:21:04-java4@Class2-4:~/homework$ git add lpogojev/CommandHistory.txt 
19:21:48-java4@Class2-4:~/homework$ git st
На ветке master
Ваша ветка опережает «origin/master» на 3 коммита.
  (используйте «git push», чтобы опубликовать ваши локальные коммиты)
Изменения, которые будут включены в коммит:
  (используйте «git reset HEAD <файл>…», чтобы убрать из индекса)

        удалено:       lpogojev/CommandHistory.txt

19:21:50-java4@Class2-4:~/homework$ git commit -m "Delete CommandHistory.txt file"
[master 6e2a377] Delete CommandHistory.txt file
 1 file changed, 47 deletions(-)
 delete mode 100644 lpogojev/CommandHistory.txt
19:22:17-java4@Class2-4:~/homework$ git push origin master 
Enter passphrase for key '/home/java4/.ssh/id_rsa': 
Подсчет объектов: 12, готово.
Delta compression using up to 4 threads.
Сжатие объектов: 100% (10/10), готово.
Запись объектов: 100% (12/12), 1.04 KiB | 0 bytes/s, готово.
Total 12 (delta 4), reused 2 (delta 0)
remote: Resolving deltas: 100% (4/4), completed with 1 local object.
To git@github.com:1eonID/homework.git
   53a6dd2..6e2a377  master -> master
19:22:50-java4@Class2-4:~/homework$ 

