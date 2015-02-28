#BWMirror API
BWMirror API allows you to treat native BWAPI C/C++ objects as if they were Java objects. Current supported version is BWAPI4 which is located at https://github.com/bwapi/bwapi . 

This project contains the API and documentation for BWMirror. If you're interested in coding your own bot for Starcraft Broodwar, you've come to the right place.
**All you need to do download is the current version .jar file, which is in the dist folder**  ,
the .dll will be auto extracted. The zip archive listed in releases also includes BWTA2 map data for SSCAI Tournament.

Example bots and other samples will be added later.


##Important differences between BWMirror v1 and BWMirror v2
- v1 uses BWAPI3, v2 uses BWAPI4
- v1 uses BWTA, v2 uses BWTA2 ( https://bitbucket.org/auriarte/bwta2 )
- UnitCommand class is now ported, you can use its static members (attack, gather, ..) to abstract the command from a unit
- PositionOrUnit class is also ported, it's used to wrap either a Positions or a Unit object as some methods now take PositionOrUnit parameter.
- Game.setTextSize now takes bwapi.Text.Size.Enum instead of int to reflect BWAPI4

##FAQ 
**How do I start creating awesome bots?**

Rafał Poniatowski has created an exceptional document if you're new to the world of SC:Broowar bots.
You can find it here: https://docs.google.com/document/d/1nJnA0_golT4T9u6bffQWybrZbZnClu-WkGfLLaBzvTk/edit

Tutorials for BWMirror v1 
- http://bwmirror.jurenka.sk
- http://www.sscaitournament.com/index.php?action=tutorial

**Can I fight against other bots?**

Sure, visit http://www.sscaitournament.com/ and register you bot 

**Where's the javadoc?**

http://vjurenka.github.io/BWMirror/javadoc/ , but v2 has only a few comments in javadoc, this will be fixed soon, for now use the the BWAPI documentation http://bwapi.github.io/ , or the v1 javadocs http://bwmirror.jurenka.sk/javadoc/ 

**I'm confused, most of the methods have empty body.**

Most of the methods are implemeted in BWAPI. BWMirror acts as a Java wrapper, the actual mapping takes place in BWMirror's .dll, which is machine genereted and it's source can be found under BWMirror-Generator project  https://github.com/vjurenka/BWMirror-Generator

**My bot prints the message "BWMirror API supports only x86 architecture." and fails to load. What's the problem?**

Install a 32-bit version of JRE and point your IDE to it. You can find the current 32-bit versions at https://www.java.com/en/download/manual.jsp 

Note: While it's possible to build x64 version of BWMirror API, it fails to cooperate with StarCraft at runtime, as StarCraft is an x86 application. Therefore we only provide the x86 version.

**Where can I suggest new functionality?**

You can do it either here or in the generator project. Please don't create merge requests here as these sources are machine generated.

**Where can I report issues?**

You can do it either here or in the generator project. If your bot crashed with JVM exception please include the .log file which was created.

**My bot freezes at startup when I enable BWTA.**

The first time BWTA analyses a map, it can take a few minutes. The results are saved to bwapi-data/BWTA/ folder for later use. We have prepared BWTA data for some maps (the map pool from SSCAITournament).





