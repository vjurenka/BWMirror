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

##Requirements
- BWAPI, version BWAPI v4.1.0-Beta https://github.com/bwapi/bwapi/releases
- 32bit JRE

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

**My bot prints the message "Error: Client and Server are not compatible! Client Revision: 4625 Server Revision: 4615" and and fails to load. What's the problem?**

Please update to BWMirror 2.3. If you updated and get the reverse error (client 4615, server 4625), reinstall BWAPI.

**My bot prints the message "BWMirror API supports only x86 architecture." and fails to load. What's the problem?**

Install a 32-bit version of JRE and point your IDE to it. You can find the current 32-bit versions at https://www.java.com/en/download/manual.jsp 

Note: While it's possible to build x64 version of BWMirror API, it fails to cooperate with StarCraft at runtime, as StarCraft is an x86 application. Therefore we only provide the x86 version.

**I'm confused, most of the api's methods have empty body.**

Most of the methods are implemeted in BWAPI. BWMirror acts as a Java wrapper, the actual mapping takes place in BWMirror's .dll, which is machine genereted and it's source can be found under BWMirror-Generator project  https://github.com/vjurenka/BWMirror-Generator

**Where can I suggest new functionality?**

You can do it either here or in the generator project. Please don't create merge requests here as these sources are machine generated.

**Where can I report issues?**

You can do it either here or in the generator project. If your bot crashed with JVM exception please include the .log file which was created.

**My bot freezes at startup when I enable BWTA.**

The first time BWTA analyses a map, it can take a few minutes. The results are saved to bwapi-data/BWTA/ folder for later use. We have prepared BWTA data for some maps (the map pool from SSCAITournament).

##Changelog
**v 2.4 **
- Generated a more complete version javadoc
- Fixed methods returning *Type objects in form of Pairs
- Added overloaded copies of methods which take PositionOrUnit as parameter. These methods now take Position, Unit or PositionOrUnit.
- Added GetUnitsInRectangle to Game
- Added toPosition and toTilePosition, to allow convertion between TilePosition and Position

**v 2.3**
- Revision 4615 is now required. This is the revision number of BWAPI4.1 official release.
- Order now has toString method
- Polygon now has getHoles() and getPoints() methods

**v 2.2**
- Fixed issues with BWTA2 methods

**v 2.1**
- BWMirror now includes and auto extracts the .dlls required for BWTA2 to work. (This solves the misssing .dlls error)
- Several new methods added to UnitType class: abilities(), upgrades(), whatBuilds(), requiredUnits()
- Two new methods added to BWTA class: getNearestTilePosition(), getGroundDistances()



