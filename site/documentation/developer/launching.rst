.. _launchinggeox:

Lancement des interfaces graphiques
=====================================

Lancement de l'interface graphique 2D depuis Eclipse 
*****************************************************
1. Dans le menu, cliquer sur 
      
   .. container:: chemin
      
      Run >> Run Configurations


2. Sélectionner comme type de run "Java Application", puis faire un click droit et sélectionner "New"

3. Configurer les éléments suivants :

   3.1 Dans la partie "Main"

   .. container:: field
     
      **Name** : GeOxygeneApplication

      **Project** : geoxygene-appli

      **Main class** : fr.ign.cogit.geoxygene.appli.GeOxygeneApplication


   .. container:: centerside
      
      .. figure:: /documentation/resources/img/launching/GeOxygeneAppliRunAs.png
         :width: 700px
       
         Figure 1 - Lancement de l'interface graphique 2D


  3.2 Dans la partie "Arguments", pour la machine virtuelle :
 
  .. container:: field
  
     **VM arguments** : -Djava.library.path=dll\win64 -Xms512M -Xmx1G
     
  où *dll\win64* définit l'emplacement où sont stockées vos librairies logicielles système (*.DLL, *.SO)


  .. container:: centerside
     
      .. figure:: /documentation/resources/img/launching/GeOxygeneAppliRunAs02.png
         :width: 700px
       
         Figure 2 - Lancement de l'interface graphique 2D


4. Cliquer sur **Run**, l'interface de GeOxygene 2D est lancée !


.. container:: centerside
     
    .. figure:: /documentation/resources/img/launching/GeOxygene2D.png
       :width: 700px
       
       Figure 3 - Interface graphique GeOxygene 2D 



Lancement de l'interface graphique 3D
***************************************

1. Dans le menu, cliquer sur 
      
   .. container:: chemin
      
      Run >> Run Configurations


2. Sélectionner comme type de run "Java Application", puis faire un click droit et sélectionner "New"


3. Configurer les éléments suivants :

   3.1 Dans la partie "Main"

   .. container:: field
     
      **Name** : GeOxygeneApplication3D

      **Project** : geoxygene-sig3d

      **Main class** : fr.ign.cogit.geoxygene.sig3d.gui.MainWindow


   .. container:: centerside
      
      .. figure:: /documentation/resources/img/launching/GeOxygene3DAppliRunAs.png
         :width: 700px
       
         Figure 4 - Lancement de l'interface graphique 3D


  3.2 Dans la partie "Arguments", pour la machine virtuelle :
 
  .. container:: field
  
     **VM arguments** : 
         
         **Win (32bits)** : 
               -Xms1156m -Xmx1156m -XX:PermSize=256m -XX:MaxPermSize=256m -Djava.library.path=./lib/native_libraries/windows-i586/
         
         **Win (64bits)** : 
               -Xms1156m -Xmx1156m -XX:PermSize=256m -XX:MaxPermSize=256m -Djava.library.path=./lib/native_libraries/windows-amd64/
     
  .. container:: centerside
     
      .. figure:: /documentation/resources/img/launching/GeOxygene3DAppliRunAs02.png
         :width: 700px
       
         Figure 5 - Lancement de l'interface graphique 3D


4. Cliquer sur **Run**, l'interface de GeOxygene 3D est lancée !


.. container:: centerside
     
    .. figure:: /documentation/resources/img/launching/GeOxygene3D.png
       :width: 600px
       
       Figure 6 - Interface graphique GeOxygene 3D


Lancement des plugins Geoxygene dans OpenJump 
***********************************************

Cette méthode ne nécessite pas d'avoir installé OpenJump sur sa machine.

1. Click droit dans l'explorateur d'Eclipse, puis "Run As", puis "Java Application"

2. Dans le premier onglet saisissez comme MainClass :

   .. container:: chemin

      com.vividsolutions.jump.workbench.JUMPWorkbench


.. container:: centerside

   .. figure:: /documentation/resources/img/launching/LancerOJEclipse01.png
      :width: 600px
      

3. Dans le second onglet, ajouter comme Program arguments de la ligne de commande :

   .. container:: chemin

      -properties ./src/main/resources/workbench-properties.xml
      -I18n fr

   
.. container:: centerside
   
   .. figure:: /documentation/resources/img/launching/LancerOJEclipse02.png
      :width: 600px
             

4. Pour lancer les plugins "quality", ceux-ci nécessitent la librairie java3d. Une version des dll est stockée dans le module "geoxygene-sig3d".

   Ajouter comme VM arguments de la ligne de commande :

   .. container:: chemin

      -Xmx1536M
      -Djava.library.path=D:/Workspace/geoxygene/geoxygene-sig3d/lib/native_libraries/windows-i586/


5. Clicker sur le bouton "Run" et openjump se lance, avec les plugins GeOxygene.



