from flask import Flask
from api import NetEase

import json

app = Flask(__name__)

@app.route('/playlist/list')
def top_playlists():
    ne = NetEase()
    json_str = ne.top_playlists()
    return json.dumps(json_str)

@app.route('/playlist/detail/<playlist_id>')
def playlist_detail(playlist_id):
    me = NetEase()
    json_str = me.playlist_detail(playlist_id)
    return json.dumps(json_str)

if __name__ == '__main__':
    app.run(host="192.168.0.104",port=8080, debug=True)