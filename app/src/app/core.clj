(ns app.core
  (:require
   [app.spec :as as]
   ;; try explicit require for `clojure.core.specs.alpha`
   ;; to fix AOT compilation in combination with `:omit-source` and `:uberjar-exclusions`
   ;; Unfortunately, it doesn't help
   [clojure.core.specs.alpha]
   [clojure.core.matrix :as m])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println (format "See you in %s days: %s" 10 (as/hello-lib 10)))
  (println "Some fancy matrices")
  (prn (m/shape [[1 2] [3 4]]) ))


;; play with :uberjar-exclusions
(comment

  ;; https://stackoverflow.com/questions/899422/regular-expression-for-a-string-that-does-not-start-with-a-sequence
  (re-find #"(?<!clojure/core/specs/alpha)\.(clj|java)" "clojure/core/specs/alpha.clj")
  ;; => nil
  (re-find #"(?<!clojure/core/specs/alpha)\.(clj|java)" "clojure/specs/alpha.clj")
  ;; => [".clj" "clj"]

  )
