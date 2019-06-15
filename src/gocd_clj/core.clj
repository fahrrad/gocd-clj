(ns gocd-clj.core)

;; generators
(defn add-pipeline
  "Add a pipeline to the environment"
  [env name]
  (assoc env name {}))

;; spec


;; renderers
