// Liens génériques
EnsembleDeLiens liensGeneriques = LienReseaux.exportLiensAppariement(liens, cartesTopo.get(0), param);

// Recalage
CarteTopo reseauRecale = Recalage.recalage(cartesTopo.get(0), cartesTopo.get(1), liensGeneriques);