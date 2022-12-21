(defproject app "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [lib "0.1.0-SNAPSHOT"]
                 ;; Both of these versions make it fail when running `java -jar ...`
                 #_[net.mikera/core.matrix "0.63.0" :exclusions [org.clojure/clojure]]
                 [net.mikera/core.matrix "0.63.0"]
                 ]
  :source-paths ["src"]
  :test-paths ["test"]

  ;; TODO: ^:skip-aot useful?
  ;; :main ^:skip-aot app.core
  :main app.core
  :target-path "target/%s"
  :uberjar-name "app.standalone.jar"
  :profiles {:uberjar {:aot :all
                       :omit-source true
                       ;; :omit-source isn't enough;
                       ;; make sure to omit sources from dependencies like analysis lib: https://github.com/technomancy/leiningen/issues/1357
                       ;; BUT still include clojure/core/specs/alpha.clj because otherwise the core.matrix stuff breaks
                       ;; when the AOTed jar is starting with compilation error
                       ;; See this for using 'negative lookbehind' https://www.regular-expressions.info/lookaround.html
                       :uberjar-exclusions [#"(?<!clojure/core/specs/alpha)\.(clj|java)"]
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
