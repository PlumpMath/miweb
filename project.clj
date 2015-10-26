(defproject miweb "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.145"]
                 [compojure "1.4.0"]
                 [ring "1.4.0"]
                 [enfocus "2.1.1"]]

  :source-paths ["src/clj"]

  :plugins [[lein-ring "0.8.13"]
            [lein-cljsbuild "1.1.0"]]

  :cljsbuild {
    :builds [{
      ; The path to the top-level ClojureScript source directory:
      :source-paths ["src/cljs"]
      ; The standard ClojureScript compiler options:
      ; (See the ClojureScript compiler documentation for details.)
      :compiler {
        :output-to "resources/public/js/main.js"
        :optimizations :whitespace
        :pretty-print true}}]}

  :ring {:handler miweb.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})


