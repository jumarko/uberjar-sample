# app

To reproduce this problem when running uberjar: 

```
Caused by: Syntax error macroexpanding clojure.core/extend-protocol at (0:0).
        at clojure.lang.Compiler.checkSpecs(Compiler.java:6989)
        at clojure.lang.Compiler.macroexpand1(Compiler.java:7005)
        at clojure.lang.Compiler.macroexpand(Compiler.java:7092)
        at clojure.lang.Compiler.eval(Compiler.java:7178)
        at clojure.lang.Compiler.eval(Compiler.java:7149)
        at clojure.core$eval.invokeStatic(core.clj:3215)
        at clojure.core$eval.invoke(core.clj:3211)
        at clojure.core.matrix.impl.persistent_vector__init.load(Unknown Source)
        at clojure.core.matrix.impl.persistent_vector__init.<clinit>(Unknown Source)
        ... 123 more
Caused by: java.io.FileNotFoundException: Could not locate clojure/core/specs/alpha__init.class, clojure/core/specs/alpha.clj or clojure/core/specs/alpha.cljc on classpath.
        at clojure.lang.RT.load(RT.java:462)
        at clojure.lang.RT.load(RT.java:424)
        at clojure.lang.Compiler.ensureMacroCheck(Compiler.java:6975)
        at clojure.lang.Compiler.checkSpecs(Compiler.java:6987)
        ... 131 more

```

## Installation

Go to ../lib and run `lein install` to install lib first.

## Usage

```
lein uberjar

java -jar target/default+uberjar/app.standalone.jar
...
```

## License

Copyright © 2022 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
