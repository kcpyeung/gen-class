(ns com.smellycat.Durian
  (:gen-class
   :name com.smellycat.Durian
   :methods [#^{:static true} [add [int int] int]]))

(defn -add [x y]
  (+ x y))

