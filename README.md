# IPTV Playlist Parser
A simple parser to parse M3U, M3U8 playlist files into usable data classes.

---

## Sample Usage

#### Local File
```kotlin
import com.dreamers.iptvplaylistparser.IptvPlaylistParser
import com.dreamers.iptvplaylistparser.models.Playlist
import com.dreamers.iptvplaylistparser.models.PlaylistItem
import java.io.File

val file: File = File("path/to/file")
val playlist: Playlist = IptvPlaylistParser().parse(file)
playlist.items.forEach {
    println(it.title)
}

```
---
#### Network File
```kotlin
import com.dreamers.iptvplaylistparser.IptvPlaylistParser
import com.dreamers.iptvplaylistparser.models.Playlist
import com.dreamers.iptvplaylistparser.models.PlaylistItemimport
import java.io.InputStream
import java.net.URL

val input: InputStream = URL("url/to/file").openStream()
val playlist: Playlist = IptvPlaylistParser().parse(input)
playlist.items.forEach {
    println(it.title)
}

```
---
#### String Content
```kotlin
import com.dreamers.iptvplaylistparser.IptvPlaylistParser
import com.dreamers.iptvplaylistparser.models.Playlist
import com.dreamers.iptvplaylistparser.models.PlaylistItemimport

val input: String = """
#EXTM3U
#EXTINF:-1 tvg-logo="url/to/logo.png",RTP 1
https://streaming-live.rtp.pt/liverepeater/rtpClean1HD.smil/playlist.m3u8|user-agent=RTP
""".trimIndent()

val playlist: Playlist = IptvPlaylistParser().parse(input)
playlist.items.forEach {
    println(it.title)
}

```