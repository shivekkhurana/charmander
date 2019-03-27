(ns charmander.storage-test
  (:require [clojure.test :refer :all]
  					[clojure.string :as str]
						[taoensso.nippy :as nippy]
						[datascript.core :as d]
						[jsonista.core :as json]
						[charmander.admin :as charm-admin]
  				  [charmander.storage :refer :all])
 (:import 	com.google.auth.oauth2.GoogleCredentials
            com.google.firebase.FirebaseApp
            com.google.firebase.FirebaseOptions
            com.google.firebase.database.DatabaseReference
            com.google.firebase.database.FirebaseDatabase
            com.google.firebase.database.DataSnapshot))

(comment

	"Template for tests"

	(deftest test-tempate
		(testing "Testing functionname"
			(let [data "" other ""]
				(do
					(is (= (#'charmander.admin/privatefunction inputs) answer))
					(is (= 1 (- 2 1)))))))
)

; Tests for interacting with firestore

(deftest test-storage-instance
		(testing "Retrieving the storage instance"
			(let [storage-ref (#'charmander.storage/storage-instance "/")]
				(do
					(is (= (type storage-ref) com.google.firebase.database.DatabaseReference))))))


(#'charmander.admin/init "firebaseKey.json" "alekcz-dev")
(def stor (#'charmander.storage/attach-storage "/charmander"))

(Thread/sleep 10000)
; (d/transact! (#'charmander.storage/conn) [ { :db/id -1
;                         :name  "Maksim"
;                         :age   45
;                         :aka   ["Max Otto von Stierlitz", "Jack Ryan"] } ])
(println (#'charmander.storage/conn))
;(. storage-ref setValueAsync (pr-str db))

(Thread/sleep 50000)