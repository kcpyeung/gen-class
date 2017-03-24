(defproject com.smellycat.Durian "0.1.0-SNAPSHOT"
  :description "an example of generating a java class from clojure functions"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main com.smellycat.Durian
  :aot [com.smellycat.Durian]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
