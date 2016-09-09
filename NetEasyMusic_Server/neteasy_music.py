from flask import Flask
from api import NetEase

import json

app = Flask(__name__)

@app.route('/playlist')
def top_playlists():
    ne = NetEase()
    json_str = ne.top_playlists()
    return json.dumps(json_str)


if __name__ == '__main__':
    app.run(host="10.60.216.82",port=8080, debug=True)