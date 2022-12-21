(ns app.core
  (:require
   [app.spec :as as]
   [clojure.core.matrix :as m])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println (format "See you in %s days: %s" 10 (as/hello-lib 10)))
  (println "Some fancy matrices")
  (prn (m/shape [[1 2] [3 4]]) ))
