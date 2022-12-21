(ns lib.core
  (:require
   [clj-time.core :as t]
   ))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn future-day [x]
  (t/plus (t/now) (t/days x)))
