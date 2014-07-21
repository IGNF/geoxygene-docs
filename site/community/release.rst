

GeOxygene releases
####################

The current development version is GeOxygene-1.7-SNAPSHOT. The latest stable release is **GeOxygene 1.6**.

All releases can be obtained from the `SourceForge download area <http://sourceforge.net/projects/oxygene-project/files/?source=navbar>`_ .
Snapshots and releases are also available from the `COGIT repositories <https://forge-cogit.ign.fr/nexus/content/repositories/>`_.


History of Changes
-------------------

Version 1.6 (2014/01/23)
^^^^^^^^^^^^^^^^^^^^^^^^^^

  * Added the EstIM model developed during the Jean-François Girres PhD, 2012. 
  
  * The old GeOxygene 2D graphical interface and CartaGen merge 
  
  * Added a new OSM module 
  
  * Added editor, import and export style in GeOxygene 2D GUI


Version 1.5 (2013/01/07)
^^^^^^^^^^^^^^^^^^^^^^^^^^
  
  * Added 3D module
  
  * Added semiology module
  
  * Added generalization module
  
  * Added data matching process using theory of Evidence
  
  * Adopted multi-module Maven architecture

Version 1.4 (2009/06/22)
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

  * Added an ISO1909 General Feature Model implementation. (cogit)

  * Added a SLD (Styled Layer Descriptor) implementation based on the OGC 02-070 implementation specification. (cogit)

  * Added an Hibernate support. (cogit)

  * Added a first version of the new GeOxygene interface. (cogit)

  * Added some code examples to learn how to use the topological map and the data matching tool. (cogit)

  * Added a Java 6 support in regard to Java 6 specifications (types, annotations, etc.). (cogit)

Version 1.3 (2008/01/31)
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

  * Adding a data matching tool (a documentation about this tool is available). (cogit)

  * Adding a simple method to create minimal spanning trees. (cogit)

  * Adding a generator of DBMS tables and XML mapping files from Java classes. (cogit)

  * Improvement of the GeOxygeneReader methods to partially take into account the GM_Aggregate geometry type (useful to visualize data matching results). (cogit)

Version 1.2 (2007/08/08)
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

  * Adding geometric tools (angles, distances, shape indicators, vectors) (cogit)

  * Adding a topological map. (cogit)

  * Adding Delaunay's triangulation support. (cogit)

  * Correction of some minor bugs. (cogit)

Version 1.1 (2006/06/12)
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

  * Compilation of the project without Oracle librairies is now possible. Some classes have been moved in the "datatools" package, calls to Oracle algorithms in GM_Object have been disabled and a new ant task named "compile-without-oracle" has been created. (abraun)

  * Improvment of the method GeoDatabase::loadAllFeatures for PostGIS (loading all the features contained in a geometry is now supported). (abraun)

  * PostGIS and Oracle can (and must) share the same XML mapping files. JDBC type is 'STRUCT' and the field conversion class is "fr.ign.cogit.geoxygene.datatools.ojb.GeomGeOxygene2Dbms". Examples of mapping files have been modified. (abraun)

  * Support of Postgis 1.0.x ! Compatibility with the previous versions of PostGIS is broken. (tbadard, abraun)

  * Generation of primary key column "COGITID" on geospatial tables in PostGIS is now possible (use the "Manage Data" item in the Console menu). (abraun)

  * Deletion of an explicit call to the TABLESPACE in the code of OracleSpatialQuery::spatialIndex. (abraun)

  * Correction of errors in the sql scripts for PostGIS. (abraun)

  * Correction of errors in the sql scripts for Oracle (since Oracle 10g, it is not possible to insert a null value in diminfo column of USER_SDO_GEOM_METADATA). (abraun)

  * A problem in the ant build file has been fixed (images and property files were not copied in the class folder). (abraun)

Version 1.0 (released)
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

  * Initial release (tbadard)
