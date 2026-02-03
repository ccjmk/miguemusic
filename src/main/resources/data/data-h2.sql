-- INSERT ARTISTS
INSERT INTO artists (first_name, last_name, nationality, birth_date) VALUES
('David', 'Bowie', 'British', '1947-01-08'),
('Prince', 'Nelson', 'American', '1958-06-07'),
('Bjork', 'Gudmundsdottir', 'Icelandic', '1965-11-21'),
('Thom', 'Yorke', 'British', '1968-10-07'),
('Grimes', 'Boucher', 'Canadian', '1988-03-17');

-- INSERT ALBUMS
INSERT INTO albums (title, release_year, artist_id) VALUES
-- David Bowie
('The Rise and Fall of Ziggy Stardust and the Spiders from Mars', 1972, 1),
('Heroes', 1977, 1),
('Scary Monsters (and Super Creeps)', 1980, 1),
-- Prince
('Sign O'' the Times', 1987, 2),
('Batman', 1989, 2),
('Diamonds and Pearls', 1991, 2),
-- Bjork
('Debut', 1993, 3),
('Post', 1995, 3),
('Homogenic', 1997, 3),
-- Thom Yorke
('OK Computer', 1997, 4),
('Kid A', 2000, 4),
('Amnestyc', 2001, 4),
-- Grimes
('Visions', 2012, 5),
('Art Angels', 2015, 5),
('Realiti', 2016, 5);

-- INSERT SONGS
INSERT INTO songs (title, duration_seconds, album_id) VALUES
-- Ziggy Stardust (album 1)
('Five Years', 325, 1),
('Soul Love', 360, 1),
('Moonage Daydream', 426, 1),
('Starman', 408, 1),
-- Heroes (album 2)
('Beauty and the Beast', 333, 2),
('Joe the Lion', 390, 2),
('Heroes', 354, 2),
('The Secret Life of Arabia', 382, 2),
-- Scary Monsters (album 3)
('Ashes to Ashes', 312, 3),
('Fashion', 318, 3),
('Scary Monsters', 420, 3),
-- Sign O'' the Times (album 4)
('Sign O'' the Times', 381, 4),
('Lovesexy', 309, 4),
('Adore', 390, 4),
('If I Gave You Diamonds and Pearls', 324, 4),
-- Batman (album 5)
('The Future', 294, 5),
('Lemon Crush', 348, 5),
('Partyman', 390, 5),
-- Diamonds and Pearls (album 6)
('Diamonds and Pearls', 264, 6),
('Cream', 318, 6),
('Insatiable', 447, 6),
('Strollin', 347, 6),
-- Debut (album 7)
('Human Behaviour', 288, 7),
('Crying', 315, 7),
('Venus as a Boy', 294, 7),
('There''s More to Life Than This', 336, 7),
-- Post (album 8)
('Army of Me', 336, 8),
('Hyperballad', 309, 8),
('Pluto', 360, 8),
('Enjoy', 285, 8),
-- Homogenic (album 9)
('Hunter', 348, 9),
('Pluto', 318, 9),
('5 Years', 390, 9),
('Immature', 324, 9),
-- OK Computer (album 10)
('Paranoid Android', 396, 10),
('Lucky', 389, 10),
('Let Down', 413, 10),
('Climbing Up the Walls', 439, 10),
-- Kid A (album 11)
('Everything in Its Right Place', 361, 11),
('Kid A', 404, 11),
('The National Anthem', 382, 11),
('Optimistic', 371, 11),
-- Amnestyc (album 12)
('Knives Out', 346, 12),
('Morning Bell', 372, 12),
('You and Whose Army?', 348, 12),
('Pulk Pull Revolving', 363, 12),
-- Visions (album 13)
('We Appreciate Power', 288, 13),
('We Bleed Together', 278, 13),
('Oblivion', 372, 13),
('Flesh Without Blood', 305, 13),
-- Art Angels (album 14)
('Flesh Without Blood', 290, 14),
('Kill V. Maim', 305, 14),
('California', 308, 14),
('Butterfly', 216, 14),
-- Realiti (album 15)
('Go', 267, 15),
('We Appreciate Power', 289, 15),
('Realiti', 381, 15);
