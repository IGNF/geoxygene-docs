
Installation de l'extension WPS GeOxygene
==========================================

Les plugins WPS GeOxygene pour GeoServer sont dans un module dédié et dans un projet différent de celui de GeOxygene.

Pour les tester, ils nécessitent :

* l'installation du projet GeOxygene.

* l'installation de GeoServer et de son extension WPS.


Installation de GeoServer et l'extension WPS
***********************************************

1. Installer GeoServer en suivant les instructions :

   .. container:: chemin

      http://geoserver.geo-solutions.it/edu/en/install_run/gs_install.html

  
2. Installer l'extension WPS de GeoServer en suivant les instructions :

   .. container:: chemin

      http://geoserver.geo-solutions.it/edu/en/install_run/gs_extensions.html



Importer le projet geoxygene-wps
****************************************
Suivez les mêmes étapes que l'import du projet GeOxygene. 


En revanche, les URLS du serveur SVN sont à choisir parmi celles-ci. 
Si vous êtes enregistré sur `Sourceforge <http://sourceforge.net/>`_  et si vous avez des droits en tant que développeur ou administrateur 
sur le projet geoxygene : 

.. container:: svnurl
    
   https://svn.code.sf.net/p/oxygene-project/code/main/trunk/geoxygene-extension/geoxygene-wps/ 

Sinon :

.. container:: svnurl
   
   http://svn.code.sf.net/p/oxygene-project/code/main/trunk/geoxygene-extension/geoxygene-wps/
   

Compilation du module geoxygene-wps
************************************

Modifier les variables *path.geoxygene.noyau* et *path.geoserver* dans le pom.xml du module **geoxygene-wps** :

.. literalinclude:: /documentation/resources/code_src/wps/pom.xml
        :language: xml
        

La variable *path.geoxygene.noyau* doit contenir le chemin 

La variable *path.geoserver*

       
Il reste à compiler le module. 
        
.. container:: centerside

	.. figure:: /documentation/resources/img/wps/MavenGeoxWps.png
		:width: 700px
		       
		Figure 1 : Add new local site


Tester les services GeOxygene WPS dans GeoServer  
**************************************************

The Demo Builder is a nice GUI feature provided along with the WPS Plugin, that allows to quickly build WPS Execute 
Process requests through a step-by-step input form.


The Demo Builder provides:

* A list of available processes

* A direct link to the DescribeProcess for the selecte one

* Ability to set the input parameters, automatically build the ExecuteProcess document or execute it directly
        
* All in one form


1. Go to 

   .. container:: chemin
   
      http://localhost:8083/geoserver/web/?wicket:bookmarkablePage=:org.geoserver.wps.web.WPSRequestBuilder. 
      
   You can reach this page also clicking on :
   
   .. container:: chemin

      Demos > WPS Request Builder 


   .. container:: centerside
   
      .. figure:: /documentation/resources/img/wps/GeoServerDemoBuilder.png
		 :width: 800px
		       
		 Figure 2 : GeoServer Demo Builder
   
   
2. Choose JTS:buffer from the first combo box and fill the geometry and distance input parameters as depicted in the figure:

.. container:: centerside

	.. figure:: /documentation/resources/img/wps/GeOxygeneProcess.png
		:width: 600px
		       
		Figure 2 : GeOxygene WPS
		