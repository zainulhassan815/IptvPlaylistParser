package com.dreamers.iptvplaylistparser.models

/**
 * M3U8 playlist.
 *
 * @param items List of [PlaylistItem]s
 */
data class Playlist(
    val items: List<PlaylistItem> = emptyList(),
)