(ns gocd-clj.core-test
  (:require [clojure.test :refer :all]
            [gocd-clj.core :refer :all]
            [clojure.spec.alpha :as s]))

(deftest add-pipeline-test
  (testing "Add pipeline as a key-value pair to the env"
    (let [env (add-pipeline {} :build)]
      (is (map? env))
      (is (:build env))
      (is (map? (:build env)))))

  (testing "A pipeline should conform the spec for a pipeline"
    (let [{pipeline :build} (add-pipeline {} :build)]
      (is (s/conform)))))
