java-clojure.example
====================


Einfacher Java Code
----------------

Ein Beispiel für ein Java Programm welches Clojure Kode ausführt.
Es werden Zahlen nach einer ausgelagerten Vorschrift berechnet. Die Rechenvorschrift wurde in Clojure spezifiziert.

Das Beispiel kann wie folgt ausprobiert werden:

1. Git Repository auf die lokale Platte klonen
2. JUnit Test "ClojureCallTest" ausführen

Wenn der Test grün ergibt dann wurden 2 Testfälle ausgeführt:

1. Berechnungsvorschrift in Clojure a+b aufgerufen aus Java mit 5 und 3.
2. Berechnungsvorschrift in Clojure a-b aufgerufen aus Java mit 5 und 3.


Eclipse Runtime Plugin
----------------------

Zusätzlich kann man versuchen das Projekt als Eclipse Runtime Application zu starten.
Hierzu müssen folgende Plugins in Eclipse installiert sein:

1. Counterclockwise Plugin
   (Eclipse plugin supporting the Clojure language
   For more information, see the release note here: http://code.google.com/p/counterclockwise/wiki/ReleaseNotes)
2. Leiningen Support Plugin ebenfalls vom Counterclockwise Team.
   (Eclipse plugin adding Leiningen Support (Nature, Builder) to Java projects)

Nach dem Start der Runtime Eclipse sollte auf das Sample Icon (blaues Eclipse Icon in der Toolbar) geklickt werden.

Das Plugin funktioniert nicht immer - jenachdem ob eine Verbindung zur Clojure Engine aufgebaut werden konnte oder nicht.

Verbesserungen
--------------

Das Projekt ist nur ein einfaches Bespiel und genügt daher keinen sehr hohen Ansprüchen. 
Wenn etwas nicht gleich funktioniert suche zunächst selbst den Fehler, denn dafür ist das Beispiel gedacht. 
Solltest Du aber einen systematischen Fehler finden oder Verbesserungen wünschen dann gehe bitte wie folgt vor:

1. Erstelle per Github einen Fork von diesem Projekt
2. Implementiere die gewünschte Verbesserung
3. Teste Deine Implementierung und stelle sicher, dass auch die grundlegenden Funktionen des Beispiels noch laufen.
4. Stelle einen Pull Request.

Vielen Dank

FunThomas424242


