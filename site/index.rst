
Introduction
############################

GeOxygene aims at providing an open framework which implements
`OGC <http://www.opengeospatial.org/>`_ / `ISO <http://www.isotc211.org/>`_
specifications for the development and deployment of geographic (GIS) applications.
It is a open source contribution of the `COGIT laboratory <http://recherche.ign.fr/labos/cogit/accueilCOGIT.php>`_ at the
`IGN <http://www.ign.fr/>`_ (Institut Géographique National), the French National Mapping Agency.

GeOxygene is based on Java and open source technologies and provides users with an extensible
object data model (geographic features, geometry, topology and metadata) which implements
OGC specifications and ISO standards in the geographic information domain.
The support of the Java interfaces developped by the open source
`GeoAPI project <http://geoapi.sourceforge.net/>`_ is planned.

GeOxygene is an open source project made available to you using an open source license described :ref:`here <geoxlicense>`.

.. Data are stored in a relational DBMS (RDBMS) to ensure a rapid and reliable access to the system
.. but users do not have to worry about any SQL statements: they model their applications in UML and code in Java.
.. Mapping between object and relational environments is performed with open source software.
.. At present, `OJB <http://db.apache.org/ojb/>`_ is supported and the mapping files for the storage of
.. geographic information in `Oracle <http://www.oracle.com/>`_ or `PostGIS <http://postgis.refractions.net/>`_
.. are provided to users.


News
----------

* June 5, 2014 - **CartAGen demonstration**

    CartAGen is a component-based research platform dedicated to generalisation. It based on GeOxygene library. A demonstration entitled
    *Multi-Agent Multi-Level Cartographic Generalisation in CartAGen* will be held at `PAAMS'14 <http://www.paams.net>`_

* February 26, 2014 - **A presentation tools to estimate imprecision on geographical data**

    Jean-François Girres intervention at *Géoséminaire* entitled `Fondements théoriques et méthodologiques de la qualification des données géographiques
    <http://geoseminaire2014.teledetection.fr/index.php/programme/menu-downloads-presentations-2014/file/2-download-fondements-theoriques-et-methodologiques-de-la-qualification.html>`_ 
    showcased tools developed in his thesis to estimate geometric measurements imprecision on geographical data.
    
* January, 2014 - **Version 1.6 released**

    This new version includes the EstIM model developed during the Jean-François Girres PhD (2012), a new OSM module,
    new tools for managing style (editor, import and export SLD).
    The old GeOxygene 2D graphical interface and CartaGen graphical interface merge.

* June 10, 2013 - **What’s New in GeOxygene 1.5**
    
    The presentation on GeOxygene 1.5 at `FROG 2013 <http://frog.osgeo.fr>`_ in Saint-Mandé will focus  
    on the new features, including a description of the three new modules : geoxygene-semio (semiology), 
    geoxygene-sig3d (3D) and geoxygene-cartagen (generalization).
      
    Presentation Slides : `"GeOxygene : une plate-forme de recherche pour le développement d'applications SIG" <https://github.com/OSGeo-fr/frog2013/raw/master/presentations/technique/01-van_damme/FROG13-GeOxygene.pdf>`_ 

* January, 2013 - **Version 1.5 released**
    
    This new version includes : 

    * a new semiology module with a model of legend detailed :ref:`here <semiology>`.
      
    * a new 3D module provides a dedicated GUI mapping tool that is optimized to manipulate 3D geometry, to import special format like CityGML, postgis 3D, ..., to use objects and algorithms dedicated to 3D 

    * a new generalization module provides generalization algorithms, spatial analysis api (Multi-criteria decision analysis, ...), methods for calculating compactness, curves, congestion
        
    * data matching process using theory of Evidence
     
    Technically, the project has adopted a new multi-module Maven architecture.

.. * June 22, 2009 - **Version 1.4 released**
.. This version provides an ISO1909 General Feature Model implementation, a SLD (Styled Layer Descriptor)
..    implementation based on the OGC 02-070 implementation specification, an Hibernate support,
..    a first version of the new GeOxygene interface, some code examples to learn how to use the
..    topoligical map and the data matching tool, and a complete Java 6 support in regard to
..    Java 6 specifications (types, annotations, etc.).


Screenshots
--------------

========================================================= ============================================================= ==============================================================
.. figure:: /screenshot/geox2D_ign_style.png               .. figure:: /screenshot/ecrangeoxygene1.png                   .. figure:: /screenshot/geox3d.png
.. figure:: /screenshot/QUALITE-Estimation-Echelle.png     .. figure:: /screenshot/geoxygene_thematiqueSymbolizer.png    .. figure:: /screenshot/interfacecartagen.png
.. figure:: /screenshot/geoxygenegeopensim.png             .. figure:: /screenshot/InterfaceGraphiqueGeOxygene.png       .. figure:: /screenshot/bdtopo.jpg
========================================================= ============================================================= ==============================================================



Navigation
-------------

.. toctree::
   :maxdepth: 1

   community/index
   download/index
   documentation/index

   
   
.. Rapports Maven : lesquels (javadoc, ) et comment les intégrer

.. Gérer les liens du site internet




