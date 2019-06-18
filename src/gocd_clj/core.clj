(ns gocd-clj.core
  (:require [clojure.spec.alpha :as s]))

;; generators
(defn add-pipeline
  "Add a pipeline to the environment"
  [env name]
  (assoc env name {}))

;; spec

(s/def ::name string?)
(s/def ::pipeline
  (s/keys :req [::name]))


;; renderers
