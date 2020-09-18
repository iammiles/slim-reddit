(ns simple-reddit.core
  (:require [clojure.string :as str]))

(def lite-reddit "https://i.reddit.com")

(defn lite?
  [location]
  (let [host (->> (-> location .-host)
                  (str/lower-case))]
    (str/starts-with? host "i.")))

(defn redirect!
  [path]
  (.. js/window -location (replace (str lite-reddit path))))

(defn check-reddit
  []
  (let [location (-> js/window .-location)
        path (-> location .-pathname)]
    (when-not (lite? location)
      (redirect! path))))

(check-reddit)
