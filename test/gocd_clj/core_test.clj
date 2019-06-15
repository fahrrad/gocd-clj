(ns gocd-clj.core-test
  (:require [clojure.test :refer :all]
            [gocd-clj.core :refer :all]))

(deftest add-pipeline-test
  (testing "Add pipeline as a key-value pair to the env"
    (let [env (add-pipeline {} :build)]
      (is (map? env))
      (is (:build env))
      (is (map? (:build env))))))
