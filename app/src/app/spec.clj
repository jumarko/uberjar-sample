(ns app.spec
  (:require
   [clojure.spec.alpha :as s]
   [lib.core :refer [future-day]]))


(s/fdef hello-lib
  :args (s/cat :x int?))
(defn hello-lib [x]
  (future-day x))
