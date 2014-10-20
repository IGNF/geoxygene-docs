// Import des réseaux
IPopulation<IFeature> popRef = ShapefileReader.read("/home/glagaffe/reseau1.shp");
IPopulation<IFeature> popComp = ShapefileReader.read("/home/glagaffe/reseau2.shp");
    
// Paramètres par défaut
ParametresApp paramApp = new ParametresApp();

// On ajoute les réseaux
param.populationsArcs1.add(popRef);
param.populationsArcs2.add(popComp);

// Pour récupérer les cartes topos
List<ReseauApp> cartesTopo = new ArrayList<ReseauApp>();

// Lancement de l'appariement
EnsembleDeLiens edl = AppariementIO.appariementDeJeuxGeo(paramApp, cartesTopo);

// cartesTopo.get(0) : la carte topo du reseau le plus détaillé
// cartesTopo.get(1) : la carte topo du réseau le moins détaillé