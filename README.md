# slim-reddit
slim-reddit is a simple Firefox addon written in Clojurescript to always use `i.reddit.com` instead of the user-unfriendly `www` version. 

## Development

1. Pull down the repo
2. `cd` into project root and run`clj --main cljs.main --watch "src" --compile-opts "compile-opts.edn" --compile simple-reddit.core` to get CLJS watch compiler running
4. In another window, `cd` into the _addon_ folder and run `web-ext run --start-url https://www.reddit.com/` to get your local copy up and running on your browser.

