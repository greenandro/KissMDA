KissMDA
=======

Keep It Simple Stupid, MDA!

After working a while with MDA / MDSD technologies like AndroMDA, oAW, ... we feel like we need just another MDA tool!
Why?

1. We still like AndroMDA, yes the project is very much alive and it has already proven itself to be a strong Open Source 
project, since AndroMDA has survived the come and go of its comitters. One problem we see is the complexity of the 
project. Yes, you need to model the cartridge to build your own cartridge. In the beginning it looks like "eat
your own dog food" but at the end it makes the things much more complex to build. 

2. oAW has a different story. Until the version 4.3 it seems everything looks very smooth. After the project went 
to Eclipse it seems that the project has no activity anymore. No news anymore from oAW 5 release. 
It's really a pitty. The big problem of oAW is its Domain Specific Language (DSL) Xtend und Xpand. Since
they depend on their own editor capabilities in Eclipse and because the project seems to be dead, you will 
definitely stuck with Eclipse 3.4! No development anymore in the future.

Our solution is KissMDA (Keep It Simple Stupid, MDA!).

1. KissMDA is a pure Java API approach. No DSL. OK, we still need a templating engine and it also depends on an Eclipse
plugin. Therefore we will choose the best templating engine available wisely!

2. No need to have special Eclipse plugins, we just use Java with its Java editor in Eclipse!

3. We'll try not to use XML, instead we'll implement annotations as much as we need it.

4. Maven will be the core part of KissMDA. We'll generate the codes with a Maven plugin, we'll generate the skeleton of 
the MDA application and the cartridge project with Maven archetypes. No other choice!

We are still in the beginning of the project, so if you want to influence our direction, you are welcome to do so!

KissMDA team: Lofi, Ingo, Markus