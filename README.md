#BWMirror API - An API for SC:Broodwar AIs
BWMirror API allows you to treat native BWAPI C/C++ objects as if they were Java objects. Current supported version is BWAPI4 which is located at https://github.com/bwapi/bwapi . 

- Current BwMirror version: 2.5
- Supported BWAPI version: 4.1.2

This project contains the API and documentation for BWMirror. If you're interested in coding your own bot for Starcraft Broodwar, you've come to the right place.
**All you need to do download is the current version .jar file, which is in the dist folder**  ,
the .dll will be auto extracted. The zip archive listed in releases also includes BWTA2 map data for SSCAI Tournament.

##Requirements
- BWAPI, version BWAPI v 4.1.2 - https://github.com/bwapi/bwapi/releases
- 32bit JRE

##FAQ 
**How do I start creating awesome bots?**

Use the tutorial at SSCAI Tournament http://www.sscaitournament.com/index.php?action=tutorial or the one by 
Rafał Poniatowski https://docs.google.com/document/d/1nJnA0_golT4T9u6bffQWybrZbZnClu-WkGfLLaBzvTk/edit

**Can I fight against other bots?**

Sure, visit http://www.sscaitournament.com/ and register you bot 

**Where's the javadoc?**

You can use http://vjurenka.github.io/BWMirror/javadoc/ , which is basically a copy of BWAPI's documentation http://bwapi.github.io/ 

**My bot prints the message "Error: Client and Server are not compatible! Client Revision: XXXX Server Revision: YYYY" and and fails to load. What's the problem?**

Please update to the latest versions of both BWMirror and BWAPI.

**My bot prints the message "BWMirror API supports only x86 architecture." and fails to load. What's the problem?**

Install a 32-bit version of JRE and point your IDE to it. You can find the current 32-bit versions at https://www.java.com/en/download/manual.jsp 

Note: While it's possible to build x64 version of BWMirror API, it fails to cooperate with StarCraft at runtime, as StarCraft is an x86 application. Therefore we only provide the x86 version.

**I'm confused, most of the api's methods have empty body.**

Most of the methods are implemeted in BWAPI. BWMirror acts as a Java wrapper, the actual mapping takes place inside BWMirror's .dll, which is machine genereted and it's source can be found under BWMirror-Generator project  https://github.com/vjurenka/BWMirror-Generator

**Where can I suggest new functionality?**

You can do it either here or in the generator project. Please don't create merge requests here as these sources are machine generated.

**Where can I report issues?**

You can do it either here or in the generator project. If your bot crashed with JVM exception please include the .log file which was created.

**My bot freezes at startup when I enable BWTA.**

The first time BWTA analyses a map, it can take a few minutes. The results are saved to bwapi-data/BWTA/ folder for later use. We have prepared BWTA data for some maps (the map pool from SSCAITournament).

##Changelog
**v 2.5**
- Updated to use BWAPI 4.1.2
- Added missing methods: Game#getNukeDots(), Game#getStartLocations(), Unit#getTrainingQueue(), Chokepoint#getRegions(), Chokepoint#getSides()
- The constants such as UnitTypes, WeaponTypes or Races are now final fields.
- Updated javadocs

**v 2.4**
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



