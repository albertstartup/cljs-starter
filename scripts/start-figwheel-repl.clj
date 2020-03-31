(require '[figwheel-sidecar.repl-api :as ra])

(ra/start-figwheel!
  {:figwheel-options {}
   :build-ids ["dev"]
   :all-builds
                     [{:id "dev"
                       :figwheel true
                       :source-paths ["src"]
                       :compiler {:main 'cljs-starter.core
                                  :asset-path "js/out"
                                  :output-to "resources/public/js/main.js"
                                  :output-dir "resources/public/js/out"
                                  :verbose true}}]})

(ra/cljs-repl)