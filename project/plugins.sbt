resolvers += "web-plugin.repo" at "http://siasia.github.com/maven2"    

resolvers += "sbt-idea-repo" at "http://mpeltonen.github.com/maven/" 

resolvers += "sbt-release-repo" at "http://gseitz.github.com/maven/"

libraryDependencies <+= sbtVersion(v => "com.github.siasia" %% "xsbt-web-plugin" % (v+"-0.2.11.1"))

resolvers += Resolver.url("sbt-plugin-releases", new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)

addSbtPlugin("com.jsuereth" % "xsbt-gpg-plugin" % "0.6")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.1.0")
