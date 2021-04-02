-- INSERTS CHARACTER
INSERT INTO public.character('id','name', 'description') VALUES(nextval('character_seq'), 'Thor', 'Son of Odin');
INSERT INTO public.character('id','name', 'description') VALUES(nextval('character_seq'), 'Iron Man', 'Billionaire and philanthropist');
INSERT INTO public.character('id','name', 'description') VALUES(nextval('character_seq'), 'Spider-Man', 'Spider-Man, Spider-Man, Spider-Man');
INSERT INTO public.character('id','name', 'description') VALUES(nextval('character_seq'), 'Hulk', 'Hulk Smash!');
INSERT INTO public.character('id','name', 'description') VALUES(nextval('character_seq'), 'Captain America', '');
INSERT INTO public.character('id','name', 'description') VALUES(nextval('character_seq'), 'Black Panther', 'Wakanda Forever');

-- INSERTS COMICS
INSERT INTO public.comic('id','title', 'digital_id', 'issue_number', 'upc', 'diamond_code', 'format', 'page_count') VALUES(nextval('comic_seq'), 'Thor', 10582, 13, , '5960604745-11711', 'MAY082311', 'Comic', '0');
INSERT INTO public.comic('id','title', 'digital_id', 'issue_number', 'upc', 'diamond_code', 'format', 'page_count') VALUES(nextval('comic_seq'), 'King in Black', 10583, 1, , '5960604745-12011', 'JUN082361', 'Comic', '0');
INSERT INTO public.comic('id','title', 'digital_id', 'issue_number', 'upc', 'diamond_code', 'format', 'page_count') VALUES(nextval('comic_seq'), 'Iron Man', 10584, 1, , '5960604745-11712', 'MAY082313', 'Comic', '0');
INSERT INTO public.comic('id','title', 'digital_id', 'issue_number', 'upc', 'diamond_code', 'format', 'page_count') VALUES(nextval('comic_seq'), 'Aero', 10585, 1, , '5960604745-12012', 'JUN082362', 'Comic', '0');
INSERT INTO public.comic('id','title', 'digital_id', 'issue_number', 'upc', 'diamond_code', 'format', 'page_count') VALUES(nextval('comic_seq'), 'Non-Stop Spider-Man #1', 10580, 1, , '5960604745-11710', 'MAY082310', 'Comic', '0');
INSERT INTO public.comic('id','title', 'digital_id', 'issue_number', 'upc', 'diamond_code', 'format', 'page_count') VALUES(nextval('comic_seq'), 'Spider-Man: Bloodline (Trade Paperback)', 10581, 1, , '5960604745-12010', 'JUN082360', 'Comic', '0');
INSERT INTO public.comic('id','title', 'digital_id', 'issue_number', 'upc', 'diamond_code', 'format', 'page_count') VALUES(nextval('comic_seq'), 'Immortal Huck', 10586, 1, , '5960604745-11713', 'MAY082314', 'Comic', '0');
INSERT INTO public.comic('id','title', 'digital_id', 'issue_number', 'upc', 'diamond_code', 'format', 'page_count') VALUES(nextval('comic_seq'), 'Maestro: Symphony In A Gamma Key (Trade Paperback)', 10587, 1, , '5960604745-12013', 'JUN082363', 'Comic', '0');
INSERT INTO public.comic('id','title', 'digital_id', 'issue_number', 'upc', 'diamond_code', 'format', 'page_count') VALUES(nextval('comic_seq'), 'Captain America #28', 10588, 28, , '5960604745-11714', 'MAY082315', 'Comic', '0');
INSERT INTO public.comic('id','title', 'digital_id', 'issue_number', 'upc', 'diamond_code', 'format', 'page_count') VALUES(nextval('comic_seq'), 'Civil War: Marvels Snapshots #1', 10589, 1, , '5960604745-12014', 'JUN082364', 'Comic', '0');
INSERT INTO public.comic('id','title', 'digital_id', 'issue_number', 'upc', 'diamond_code', 'format', 'page_count') VALUES(nextval('comic_seq'), 'Black Panther and the Agents of Wakanda #7', 10590, 7, , '5960604745-11715', 'MAY082316', 'Comic', '0');
INSERT INTO public.comic('id','title', 'digital_id', 'issue_number', 'upc', 'diamond_code', 'format', 'page_count') VALUES(nextval('comic_seq'), 'King In Black: Black Panther #1', 10591, 1, , '5960604745-12015', 'JUN082365', 'Comic', '0');

-- INSERTS CREATORSss
INSERT INTO public.creator('id','name') VALUES(nextval('creator_seq'), 'Jason Aaron');
INSERT INTO public.creator('id','name') VALUES(nextval('creator_seq'), 'Saladin Ahmed');
INSERT INTO public.creator('id','name') VALUES(nextval('creator_seq'), 'Donny Cates');
INSERT INTO public.creator('id','name') VALUES(nextval('creator_seq'), 'Nick Spencer');
INSERT INTO public.creator('id','name') VALUES(nextval('creator_seq'), 'Tini Howard');
INSERT INTO public.creator('id','name') VALUES(nextval('creator_seq'), 'Pepe Larraz');

-- INSERTS EVENT
INSERT INTO public.event('id','name', 'description', 'start_event', 'end_event') VALUES(nextval('event_seq'), 'Civil War', 'After a horrific tragedy raises questions on whether or not super heroes should register with the government, longtime Avengers teammates Captain America and Iron Man end up on opposite sides of the argument! Writer Mark Millar and artist Steve McNiven split the Marvel Universe in two as friend fights friend in one of the most celebrated and successful events of all-time!', '2006-06-01', '2007-06-01');
INSERT INTO public.event('id','name', 'description', 'start_event', 'end_event') VALUES(nextval('event_seq'), 'Secret Empire', 'Steve Rogers has gone rogue and taken over the United States! It''s up to the united forces of the Avengers, the Champions, the X-Men and more to bring down one of their own in the nine-issue limited series written by Nick Spencer!', '2007-04-01', '2017-08-01');
INSERT INTO public.event('id','name', 'description', 'start_event', 'end_event') VALUES(nextval('event_seq'), 'Secret Wars', 'Time Runs Out. Everything Ends. The Secret Wars commence in May 2015 from Jonathan Hickman and Esad Ribic!', '2015-05-01', '2015-12-01');
INSERT INTO public.event('id','name', 'description', 'start_event', 'end_event') VALUES(nextval('event_seq'), 'Avengers VS X-men', 'A 12-issue event written by the unprecedented team of Brian Michael Bendis, Jason Aaron, Jonathan Hickman, Ed Brubaker and Matt Fraction with art by the blockbuster trio of John Romita Jr., Olivier Coipel and Adam Kubert, Avengers VS X-Men brings Marvel''s biggest characters up against the greatest threat they''ve ever faced: each other!', '2012-04-01', '2012-09-01');

-- INSERTS SERIES
INSERT INTO public.series('id','title', 'description', 'start_year') VALUES(nextval('series_seq'), 'Avengers', 'Earth Mightiest Heroes', 2018);
INSERT INTO public.series('id','title', 'description', 'start_year', 'end_year') VALUES(nextval('series_seq'), 'Infinity Gauntlet', 'All of Marvel''s top heroes star in this epic of cosmic proportions!', 1991, 1991);
INSERT INTO public.series('id','title', 'description', 'start_year') VALUES(nextval('series_seq'), 'The Amazing Spider-Man', '', 2018);

-- INSERTS STORY
INSERT INTO public.story('id','title', 'description', 'type') VALUES(nextval('story_seq'), 'Incredible Huck (2008) #117', 'This is a very good story!', 'principal');
INSERT INTO public.story('id','title', 'description', 'type') VALUES(nextval('story_seq'), 'Iron Man (2008) #118', 'This is a very good story!', 'principal');
INSERT INTO public.story('id','title', 'description', 'type') VALUES(nextval('story_seq'), 'Spider-Man (2008) #119', 'This is a very good story!', 'principal');
INSERT INTO public.story('id','title', 'description', 'type') VALUES(nextval('story_seq'), 'Hulk (2008) #120', 'This is a very good story!', 'principal');
INSERT INTO public.story('id','title', 'description', 'type') VALUES(nextval('story_seq'), 'Captain America (2008) #121', 'This is a very good story!', 'principal');
INSERT INTO public.story('id','title', 'description', 'type') VALUES(nextval('story_seq'), 'Black Panther (2008) #122', 'This is a very good story!', 'principal');

-- INSERTS PIVOTS # Thor
INSERT INTO public.story('character_id','comic_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Thor'), (SELECT  val_2 FROM public.comic WHERE title = 'Thor'));
INSERT INTO public.story('character_id','comic_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Thor'), (SELECT  val_2 FROM public.comic WHERE title = 'King in Black'));
INSERT INTO public.story('character_id','creator_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Thor'), (SELECT  val_2 FROM public.comic WHERE public.name = 'Jason Aaron'));
INSERT INTO public.story('character_id','creator_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Thor'), (SELECT  val_2 FROM public.comic WHERE public.name = 'Pepe Larraz'));
INSERT INTO public.story('character_id','event_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Thor') (SELECT  val_2 FROM public.comic WHERE public.name = 'Civil War'));
INSERT INTO public.story('character_id','series_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Thor'), (SELECT  val_2 FROM public.comic WHERE title = 'Avengers');
INSERT INTO public.story('character_id','story_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Thor'), (SELECT  val_2 FROM public.comic WHERE title = 'Spider-Man (2008) #119'));

-- INSERTS PIVOTS # Iron Man
INSERT INTO public.story('character_id','comic_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Iron Man'), (SELECT  val_2 FROM public.comic WHERE title = 'Iron Man'));
INSERT INTO public.story('character_id','comic_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Iron Man'), (SELECT  val_2 FROM public.comic WHERE title = 'Aero'));
INSERT INTO public.story('character_id','creator_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Iron Man'), (SELECT  val_2 FROM public.comic WHERE public.name = 'Donny Cates'));
INSERT INTO public.story('character_id','creator_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Iron Man'), (SELECT  val_2 FROM public.comic WHERE public.name = 'Pepe Larraz'));
INSERT INTO public.story('character_id','event_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Iron Man') (SELECT  val_2 FROM public.comic WHERE public.name = 'Civil War'));
INSERT INTO public.story('character_id','series_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Iron Man'), (SELECT  val_2 FROM public.comic WHERE title = 'Avengers');
INSERT INTO public.story('character_id','story_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Iron Man'), (SELECT  val_2 FROM public.comic WHERE title = 'Iron Man (2008) #118'));

-- INSERTS PIVOTS # Spider-Man
INSERT INTO public.story('character_id','comic_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Spider-Man'), (SELECT  val_2 FROM public.comic WHERE title = 'Non-Stop Spider-Man #1'));
INSERT INTO public.story('character_id','comic_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Spider-Man'), (SELECT  val_2 FROM public.comic WHERE title = 'Spider-Man: Bloodline (Trade Paperback)'));
INSERT INTO public.story('character_id','creator_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Spider-Man'), (SELECT  val_2 FROM public.comic WHERE public.name = 'Jason Aaron'));
INSERT INTO public.story('character_id','creator_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Spider-Man'), (SELECT  val_2 FROM public.comic WHERE public.name = 'Nick Spencer'));
INSERT INTO public.story('character_id','event_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Spider-Man') (SELECT  val_2 FROM public.comic WHERE public.name = 'Secret Empire'));
INSERT INTO public.story('character_id','series_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Spider-Man'), (SELECT  val_2 FROM public.comic WHERE title = 'Avengers');
INSERT INTO public.story('character_id','story_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Spider-Man'), (SELECT  val_2 FROM public.comic WHERE title = 'Iron Man (2008) #118'));

-- INSERTS PIVOTS # Hulk
INSERT INTO public.story('character_id','comic_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Hulk'), (SELECT  val_2 FROM public.comic WHERE title = 'Immortal Huck'));
INSERT INTO public.story('character_id','comic_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Hulk'), (SELECT  val_2 FROM public.comic WHERE title = 'Maestro: Symphony In A Gamma Key (Trade Paperback)'));
INSERT INTO public.story('character_id','creator_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Hulk'), (SELECT  val_2 FROM public.comic WHERE public.name = 'Donny Cates'));
INSERT INTO public.story('character_id','creator_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Hulk'), (SELECT  val_2 FROM public.comic WHERE public.name = 'Pepe Larraz'));
INSERT INTO public.story('character_id','event_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Hulk') (SELECT  val_2 FROM public.comic WHERE public.name = 'Secret Wars'));
INSERT INTO public.story('character_id','series_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Hulk'), (SELECT  val_2 FROM public.comic WHERE title = 'Avengers');
INSERT INTO public.story('character_id','story_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Hulk'), (SELECT  val_2 FROM public.comic WHERE title = 'Spider-Man (2008) #119'));

-- INSERTS PIVOTS # Captain America
INSERT INTO public.story('character_id','comic_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Captain America'), (SELECT  val_2 FROM public.comic WHERE title = 'Captain America #28'));
INSERT INTO public.story('character_id','comic_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Captain America'), (SELECT  val_2 FROM public.comic WHERE title = 'Civil War: Marvels Snapshots #1'));
INSERT INTO public.story('character_id','creator_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Captain America'), (SELECT  val_2 FROM public.comic WHERE public.name = 'Donny Cates'));
INSERT INTO public.story('character_id','creator_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Captain America'), (SELECT  val_2 FROM public.comic WHERE public.name = 'Nick Spencer'));
INSERT INTO public.story('character_id','event_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Captain America') (SELECT  val_2 FROM public.comic WHERE public.name = 'Civil War'));
INSERT INTO public.story('character_id','series_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Captain America'), (SELECT  val_2 FROM public.comic WHERE title = 'Infinity Gauntlet');
INSERT INTO public.story('character_id','story_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Captain America'), (SELECT  val_2 FROM public.comic WHERE title = 'Spider-Man (2008) #119'));

-- INSERTS PIVOTS # Black Panther
INSERT INTO public.story('character_id','comic_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Black Panther'), (SELECT  val_2 FROM public.comic WHERE title = 'Black Panther and the Agents of Wakanda #7'));
INSERT INTO public.story('character_id','comic_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Black Panther'), (SELECT  val_2 FROM public.comic WHERE title = 'King In Black: Black Panther #1'));
INSERT INTO public.story('character_id','creator_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Black Panther'), (SELECT  val_2 FROM public.comic WHERE public.name = 'Jason Aaron'));
INSERT INTO public.story('character_id','creator_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Black Panther'), (SELECT  val_2 FROM public.comic WHERE public.name = 'Nick Spencer'));
INSERT INTO public.story('character_id','event_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Black Panther') (SELECT  val_2 FROM public.comic WHERE public.name = 'Avengers VS X-men'));
INSERT INTO public.story('character_id','series_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Black Panther'), (SELECT  val_2 FROM public.comic WHERE title = 'Infinity Gauntlet');
INSERT INTO public.story('character_id','story_id') VALUES((SELECT id FROM public.character WHERE public.name = 'Black Panther'), (SELECT  val_2 FROM public.comic WHERE title = 'Spider-Man (2008) #119'));