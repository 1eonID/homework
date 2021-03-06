```sh
$ git clone git@github.com:1eonID/homework.git
Клонирование в «homework»…
Enter passphrase for key '/home/java4/.ssh/id_rsa': 
remote: Counting objects: 32, done.
remote: Total 32 (delta 0), reused 0 (delta 0), pack-reused 32
Получение объектов: 100% (32/32), готово.
Определение изменений: 100% (1/1), готово.
Проверка соединения… готово.
```

```sh
$ cd homework/
```

```sh
$ git init
Реинициализация существующего репозиторий Git в /home/java4/homework/.git/
```

```sh
$ mkdir lpogojev
```

```sh
$ mkdir lpogojev/src
```

```sh
$ mkdir lpogojev/out
```

```sh
$ touch lpogojev/README.md
```

```sh
$ git add lpogojev/README.md 
```

```sh
$ git commit -m "Create README.md file"
[master fbdc5c0] Create README.md file
 1 file changed, 1 deletion(-)
```

```sh
$ touch lpogojev/src/SimpleMain.java
```

```sh
$ git add lpogojev/src/SimpleMain.java 
```

```sh
$ git commit -m "Create SimpleMain.java file"
[master 208c8be] Create SimpleMain.java file
 1 file changed, 6 deletions(-)
```

```sh
$ atom lpogojev/src/SimpleMain.java 
```

```sh
$ cat lpogojev/src/SimpleMain.java
```
```java
public class SimpleMain {
  public static void main(String[] args) {
    // Here will be cool artifitial intelligence algorithm :)
    System.out.println("Hello again... worm!");
  }
}
```

```sh
$ git add lpogojev/src/SimpleMain.java  
```

```sh
$ git commit -m "Edit SimpleMain.java file"      
[master 1bff79d] Edit SimpleMain.java file
 1 file changed, 6 insertions(+)
```

```sh
$ javac -d lpogojev/out lpogojev/src/SimpleMain.java
```

```sh
$ java -cp lpogojev/out/ SimpleMain 
Hello again... worm!
```

```sh
$ git commit -m "Compile SimpleMain.java file and run SimpleMain.class file"
На ветке master
Ваша ветка опережает «origin/master» на 3 коммита.
  (используйте «git push», чтобы опубликовать ваши локальные коммиты)
Изменения, которые не в индексе для коммита:
        удалено:       lpogojev/CommandHistory.txt
        удалено:       lpogojev/manifest.txt

нет изменений добавленных для коммита
```

```sh
$ jar -cvf app.jar -C lpogojev/out/ .
added manifest
adding: SimpleMain.class(in = 434) (out= 298)(deflated 31%)
```

```sh
$ java -jar app.jar 
no main manifest attribute, in app.jar
```

```sh
$ java -cp app.jar SimpleMain 
Hello again... worm!
```

```sh
$ touch lpogojev/manifest.txt
```

```sh
$ nano lpogojev/manifest.txt 
```

```sh
$ git add lpogojev/manifest.txt 
```

```sh
$ git commit -m "Create manifest.txt file"                   
На ветке master
Ваша ветка опережает «origin/master» на 3 коммита.
  (используйте «git push», чтобы опубликовать ваши локальные коммиты)
Изменения, которые не в индексе для коммита:
        удалено:       lpogojev/CommandHistory.txt

нет изменений добавленных для коммита
```

```sh
$ cat lpogojev/manifest.txt 
Main-Class: SimpleMain  
```

```sh
$ jar -cvfm app.jar lpogojev/manifest.txt -C lpogojev/out/ . 
added manifest
adding: SimpleMain.class(in = 434) (out= 298)(deflated 31%)
```

```sh
$ java -jar app.jar 
Hello again... worm!
```

```sh
$ git add lpogojev/CommandHistory.txt 
```

```sh
$ git commit -m "Delete CommandHistory.txt file"
[master 6e2a377] Delete CommandHistory.txt file
 1 file changed, 47 deletions(-)
 delete mode 100644 lpogojev/CommandHistory.txt
```

```sh
$ git push origin master 
Enter passphrase for key '/home/java4/.ssh/id_rsa': 
Подсчет объектов: 12, готово.
Delta compression using up to 4 threads.
Сжатие объектов: 100% (10/10), готово.
Запись объектов: 100% (12/12), 1.04 KiB | 0 bytes/s, готово.
Total 12 (delta 4), reused 2 (delta 0)
remote: Resolving deltas: 100% (4/4), completed with 1 local object.
To git@github.com:1eonID/homework.git
   53a6dd2..6e2a377  master -> master
```

