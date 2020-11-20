# JavaFX-Wallpaper
## Intro 

I created this example because on all these occasions i saw too many wallpaper with code inside, that seem to be in Java but they are not.  
So, this is a litte JavaFX app where the code can "convert" into the Wallpaper and it is.  
The theme IDE used it is [Dracula Theme](https://draculatheme.com/) <- Great site, for the wallpaper code.   

## Requirements and installation
The site [OpenJFX](https://openjfx.io/)  has the docs to install [Java](https://openjfx.io/openjfx-docs/#install-java) and [JavaFX](https://openjfx.io/openjfx-docs/#install-javafx).  
Pay attention to the docs installation of JavaFX specially to export path and [Runtime images](https://openjfx.io/openjfx-docs/#modular).  
Gradle https://openjfx.io/openjfx-docs/#gradle  
You can download JavaFX from Gluon site https://gluonhq.com/products/javafx/


I'm always try to use LTS versions of Java LTS, in that case the is 11 and JavaFX 11 too.

## Run  
You can clone this repo to see how it works:  

Export your java home and javafx path, point to your own path, for example:  
`export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64`  
`export JAVAFX=/opt/openjfx-11.0.2_linux-x64_bin-sdk/javafx-sdk-11.0.2/lib/`  
`export JAVAFX_MODS=/opt/openjfx-11.0.2_linux-x64_bin-jmods/javafx-jmods-11.0.2/`  

then run:  
`./gradlew run`  

You can pass you own url with the param to see your own     
`./gradlew run --args='--url=https://www.java.net.ar/user/pages/01.home/javanetar.jpg'`  

You can modify, compile and run it from the command line:   
Compile  
`/usr/lib/jvm/java-11-openjdk-amd64/bin/javac --module-path $JAVAFX --add-modules javafx.controls src/main/java/WallpaperIsTheCode.java`

Run  
`cd src/main/java/`  
`/usr/lib/jvm/java-11-openjdk-amd64/bin/java --module-path $JAVAFX --add-modules javafx.controls WallpaperIsTheCode`   

Run with url param:  
`/usr/lib/jvm/java-11-openjdk-amd64/bin/java --module-path $JAVAFX --add-modules javafx.controls WallpaperIsTheCode --url=https://www.java.net.ar/user/pages/01.home/javanetar.jpg`  


### Feel free to get intouch and fork this repo.
## Enjoy it!
