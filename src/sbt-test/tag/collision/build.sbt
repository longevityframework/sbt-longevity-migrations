version := "0.0"
scalaVersion := "2.12.2"
enablePlugins(longevity.migrations.Plugin)
modelPackage := "simple.model"
migrationsPackage := "simple.migrations"
libraryDependencies += "org.longevityframework" %% "longevity"             % sys.props("longevity.version")
libraryDependencies += "org.longevityframework" %% "longevity-migrations"  % sys.props("longevity.version")
