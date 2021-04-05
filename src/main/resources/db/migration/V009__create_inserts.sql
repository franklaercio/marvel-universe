-- INSERTS CHARACTER
INSERT INTO public.character(id, name, description, modified) VALUES(nextval('character_seq'), 'Thor', 'Son of Odin', CURRENT_TIMESTAMP);
INSERT INTO public.character(id, name, description, modified) VALUES(nextval('character_seq'), 'Iron Man', 'Billionaire and philanthropist', CURRENT_TIMESTAMP);
INSERT INTO public.character(id, name, description, modified) VALUES(nextval('character_seq'), 'Spider-Man', 'Spider-Man, Spider-Man, Spider-Man', CURRENT_TIMESTAMP);
INSERT INTO public.character(id, name, description, modified) VALUES(nextval('character_seq'), 'Hulk', 'Hulk Smash!', CURRENT_TIMESTAMP);
INSERT INTO public.character(id, name, description, modified) VALUES(nextval('character_seq'), 'Captain America', '', CURRENT_TIMESTAMP);
INSERT INTO public.character(id, name, description, modified) VALUES(nextval('character_seq'), 'Black Panther', 'Wakanda Forever', CURRENT_TIMESTAMP);

-- INSERTS COMICS
INSERT INTO public.comic(id,title, digital_id, issue_number, upc, diamond_code, format, page_count, modified) VALUES(nextval('comic_seq'), 'Thor', 10582, 13, '5960604745-11711', 'MAY082311', 'Comic', '0', CURRENT_TIMESTAMP);
INSERT INTO public.comic(id,title, digital_id, issue_number, upc, diamond_code, format, page_count, modified) VALUES(nextval('comic_seq'), 'King in Black', 10583, 1, '5960604745-12011', 'JUN082361', 'Comic', '0', CURRENT_TIMESTAMP);
INSERT INTO public.comic(id,title, digital_id, issue_number, upc, diamond_code, format, page_count, modified) VALUES(nextval('comic_seq'), 'Iron Man', 10584, 1, '5960604745-11712', 'MAY082313', 'Comic', '0', CURRENT_TIMESTAMP);
INSERT INTO public.comic(id,title, digital_id, issue_number, upc, diamond_code, format, page_count, modified) VALUES(nextval('comic_seq'), 'Aero', 10585, 1, '5960604745-12012', 'JUN082362', 'Comic', '0', CURRENT_TIMESTAMP);
INSERT INTO public.comic(id,title, digital_id, issue_number, upc, diamond_code, format, page_count, modified) VALUES(nextval('comic_seq'), 'Non-Stop Spider-Man #1', 10580, 1, '5960604745-11710', 'MAY082310', 'Comic', '0', CURRENT_TIMESTAMP);
INSERT INTO public.comic(id,title, digital_id, issue_number, upc, diamond_code, format, page_count, modified) VALUES(nextval('comic_seq'), 'Spider-Man: Bloodline (Trade Paperback)', 10581, 1, '5960604745-12010', 'JUN082360', 'Comic', '0', CURRENT_TIMESTAMP);
INSERT INTO public.comic(id,title, digital_id, issue_number, upc, diamond_code, format, page_count, modified) VALUES(nextval('comic_seq'), 'Immortal Huck', 10586, 1, '5960604745-11713', 'MAY082314', 'Comic', '0', CURRENT_TIMESTAMP);
INSERT INTO public.comic(id,title, digital_id, issue_number, upc, diamond_code, format, page_count, modified) VALUES(nextval('comic_seq'), 'Maestro: Symphony In A Gamma Key (Trade Paperback)', 10587, 1, '5960604745-12013', 'JUN082363', 'Comic', '0', CURRENT_TIMESTAMP);
INSERT INTO public.comic(id,title, digital_id, issue_number, upc, diamond_code, format, page_count, modified) VALUES(nextval('comic_seq'), 'Captain America #28', 10588, 28, '5960604745-11714', 'MAY082315', 'Comic', '0', CURRENT_TIMESTAMP);
INSERT INTO public.comic(id,title, digital_id, issue_number, upc, diamond_code, format, page_count, modified) VALUES(nextval('comic_seq'), 'Civil War: Marvels Snapshots #1', 10589, 1, '5960604745-12014', 'JUN082364', 'Comic', '0', CURRENT_TIMESTAMP);
INSERT INTO public.comic(id,title, digital_id, issue_number, upc, diamond_code, format, page_count, modified) VALUES(nextval('comic_seq'), 'Black Panther and the Agents of Wakanda #7', 10590, 7, '5960604745-11715', 'MAY082316', 'Comic', '0', CURRENT_TIMESTAMP);
INSERT INTO public.comic(id,title, digital_id, issue_number, upc, diamond_code, format, page_count, modified) VALUES(nextval('comic_seq'), 'King In Black: Black Panther #1', 10591, 1, '5960604745-12015', 'JUN082365', 'Comic', '0', CURRENT_TIMESTAMP);

-- INSERTS CREATORS
INSERT INTO public.creator(id, name, modified) VALUES(nextval('creator_seq'), 'Jason Aaron', CURRENT_TIMESTAMP);
INSERT INTO public.creator(id, name, modified) VALUES(nextval('creator_seq'), 'Saladin Ahmed', CURRENT_TIMESTAMP);
INSERT INTO public.creator(id, name, modified) VALUES(nextval('creator_seq'), 'Donny Cates', CURRENT_TIMESTAMP);
INSERT INTO public.creator(id, name, modified) VALUES(nextval('creator_seq'), 'Nick Spencer', CURRENT_TIMESTAMP);
INSERT INTO public.creator(id, name, modified) VALUES(nextval('creator_seq'), 'Tini Howard', CURRENT_TIMESTAMP);
INSERT INTO public.creator(id, name, modified) VALUES(nextval('creator_seq'), 'Pepe Larraz', CURRENT_TIMESTAMP);

-- INSERTS EVENT
INSERT INTO public.event(id, name, description, start_event, end_event, modified) VALUES(nextval('event_seq'), 'Civil War', 'After a horrific tragedy raises questions on whether or not super heroes should register with the government!', '2006-06-01', '2007-06-01', CURRENT_TIMESTAMP);
INSERT INTO public.event(id, name, description, start_event, end_event, modified) VALUES(nextval('event_seq'), 'Secret Empire', 'Steve Rogers has gone rogue and taken over the United States! It''s up to the united forces of the Avengers!', '2007-04-01', '2017-08-01', CURRENT_TIMESTAMP);
INSERT INTO public.event(id, name, description, start_event, end_event, modified) VALUES(nextval('event_seq'), 'Secret Wars', 'Time Runs Out. Everything Ends. The Secret Wars commence in May 2015 from Jonathan Hickman and Esad Ribic!', '2015-05-01', '2015-12-01', CURRENT_TIMESTAMP);
INSERT INTO public.event(id, name, description, start_event, end_event, modified) VALUES(nextval('event_seq'), 'Avengers VS X-men', 'A 12-issue event written by the unprecedented team of Brian Michael Bendis, Jason Aaron, Jonathan Hickman!', '2012-04-01', '2012-09-01', CURRENT_TIMESTAMP);

-- INSERTS SERIES
INSERT INTO public.series(id, title, description, start_year, modified) VALUES(nextval('series_seq'), 'Avengers', 'Earth Mightiest Heroes', 2018, CURRENT_TIMESTAMP);
INSERT INTO public.series(id, title, description, start_year, modified) VALUES(nextval('series_seq'), 'Infinity Gauntlet', 1991, 1991, CURRENT_TIMESTAMP);
INSERT INTO public.series(id, title, description, start_year, modified) VALUES(nextval('series_seq'), 'The Amazing Spider-Man', '', 2018, CURRENT_TIMESTAMP);

-- INSERTS STORY
INSERT INTO public.story(id,title, description, type, modified) VALUES(nextval('story_seq'), 'Incredible Huck (2008) #117', 'This is a very good story!', 'principal', CURRENT_TIMESTAMP);
INSERT INTO public.story(id,title, description, type, modified) VALUES(nextval('story_seq'), 'Iron Man (2008) #118', 'This is a very good story!', 'principal', CURRENT_TIMESTAMP);
INSERT INTO public.story(id,title, description, type, modified) VALUES(nextval('story_seq'), 'Spider-Man (2008) #119', 'This is a very good story!', 'principal', CURRENT_TIMESTAMP);
INSERT INTO public.story(id,title, description, type, modified) VALUES(nextval('story_seq'), 'Hulk (2008) #120', 'This is a very good story!', 'principal', CURRENT_TIMESTAMP);
INSERT INTO public.story(id,title, description, type, modified) VALUES(nextval('story_seq'), 'Captain America (2008) #121', 'This is a very good story!', 'principal', CURRENT_TIMESTAMP);
INSERT INTO public.story(id,title, description, type, modified) VALUES(nextval('story_seq'), 'Black Panther (2008) #122', 'This is a very good story!', 'principal', CURRENT_TIMESTAMP);

-- INSERTS PIVOTS # Thor
INSERT INTO public.character_comic(character_id, comic_id) VALUES((SELECT id FROM public.character WHERE name = 'Thor'), (SELECT id FROM public.comic WHERE title = 'Thor'));
INSERT INTO public.character_comic(character_id, comic_id) VALUES((SELECT id FROM public.character WHERE name = 'Thor'), (SELECT id FROM public.comic WHERE title = 'King in Black'));
INSERT INTO public.character_creator(character_id, creator_id) VALUES((SELECT id FROM public.character WHERE name = 'Thor'), (SELECT id FROM public.creator WHERE name = 'Jason Aaron'));
INSERT INTO public.character_creator(character_id, creator_id) VALUES((SELECT id FROM public.character WHERE name = 'Thor'), (SELECT id FROM public.creator WHERE name = 'Pepe Larraz'));
INSERT INTO public.character_event(character_id, event_id) VALUES((SELECT id FROM public.character WHERE name = 'Thor'), (SELECT id FROM public.event WHERE name = 'Civil War'));
INSERT INTO public.character_series(character_id, series_id) VALUES((SELECT id FROM public.character WHERE name = 'Thor'), (SELECT  id FROM public.series WHERE title = 'Avengers'));
INSERT INTO public.character_story(character_id, story_id) VALUES((SELECT id FROM public.character WHERE name = 'Thor'), (SELECT  id FROM public.story WHERE title = 'Spider-Man (2008) #119'));

-- INSERTS PIVOTS # Iron Man
INSERT INTO public.character_comic(character_id,comic_id) VALUES((SELECT id FROM public.character WHERE name = 'Iron Man'), (SELECT  id FROM public.comic WHERE title = 'Iron Man'));
INSERT INTO public.character_comic(character_id,comic_id) VALUES((SELECT id FROM public.character WHERE name = 'Iron Man'), (SELECT  id FROM public.comic WHERE title = 'Aero'));
INSERT INTO public.character_creator(character_id, creator_id) VALUES((SELECT id FROM public.character WHERE name = 'Iron Man'), (SELECT  id FROM public.creator WHERE name = 'Donny Cates'));
INSERT INTO public.character_creator(character_id, creator_id) VALUES((SELECT id FROM public.character WHERE name = 'Iron Man'), (SELECT  id FROM public.creator WHERE name = 'Pepe Larraz'));
INSERT INTO public.character_event(character_id, event_id) VALUES((SELECT id FROM public.character WHERE name = 'Iron Man'), (SELECT  id FROM public.event WHERE name = 'Civil War'));
INSERT INTO public.character_series(character_id, series_id) VALUES((SELECT id FROM public.character WHERE name = 'Iron Man'), (SELECT  id FROM public.series WHERE title = 'Avengers'));
INSERT INTO public.character_story(character_id, story_id) VALUES((SELECT id FROM public.character WHERE name = 'Iron Man'), (SELECT  id FROM public.story WHERE title = 'Iron Man (2008) #118'));

-- INSERTS PIVOTS # Spider-Man
INSERT INTO public.character_comic(character_id, comic_id) VALUES((SELECT id FROM public.character WHERE name = 'Spider-Man'), (SELECT  id FROM public.comic WHERE title = 'Non-Stop Spider-Man #1'));
INSERT INTO public.character_comic(character_id, comic_id) VALUES((SELECT id FROM public.character WHERE name = 'Spider-Man'), (SELECT  id FROM public.comic WHERE title = 'Spider-Man: Bloodline (Trade Paperback)'));
INSERT INTO public.character_creator(character_id, creator_id) VALUES((SELECT id FROM public.character WHERE name = 'Spider-Man'), (SELECT  id FROM public.creator WHERE name = 'Jason Aaron'));
INSERT INTO public.character_creator(character_id, creator_id) VALUES((SELECT id FROM public.character WHERE name = 'Spider-Man'), (SELECT  id FROM public.creator WHERE name = 'Nick Spencer'));
INSERT INTO public.character_event(character_id, event_id) VALUES((SELECT id FROM public.character WHERE name = 'Spider-Man'), (SELECT  id FROM public.event WHERE name = 'Secret Empire'));
INSERT INTO public.character_series(character_id, series_id) VALUES((SELECT id FROM public.character WHERE name = 'Spider-Man'), (SELECT  id FROM public.series WHERE title = 'Avengers'));
INSERT INTO public.character_story(character_id, story_id) VALUES((SELECT id FROM public.character WHERE name = 'Spider-Man'), (SELECT  id FROM public.story WHERE title = 'Iron Man (2008) #118'));

-- INSERTS PIVOTS # Hulk
INSERT INTO public.character_comic(character_id, comic_id) VALUES((SELECT id FROM public.character WHERE name = 'Hulk'), (SELECT  id FROM public.comic WHERE title = 'Immortal Huck'));
INSERT INTO public.character_comic(character_id, comic_id) VALUES((SELECT id FROM public.character WHERE name = 'Hulk'), (SELECT  id FROM public.comic WHERE title = 'Maestro: Symphony In A Gamma Key (Trade Paperback)'));
INSERT INTO public.character_creator(character_id, creator_id) VALUES((SELECT id FROM public.character WHERE name = 'Hulk'), (SELECT  id FROM public.creator WHERE name = 'Donny Cates'));
INSERT INTO public.character_creator(character_id, creator_id) VALUES((SELECT id FROM public.character WHERE name = 'Hulk'), (SELECT  id FROM public.creator WHERE name = 'Pepe Larraz'));
INSERT INTO public.character_event(character_id, event_id) VALUES((SELECT id FROM public.character WHERE name = 'Hulk'), (SELECT  id FROM public.event WHERE name = 'Secret Wars'));
INSERT INTO public.character_series(character_id, series_id) VALUES((SELECT id FROM public.character WHERE name = 'Hulk'), (SELECT  id FROM public.series WHERE title = 'Avengers'));
INSERT INTO public.character_story(character_id, story_id) VALUES((SELECT id FROM public.character WHERE name = 'Hulk'), (SELECT  id FROM public.story WHERE title = 'Spider-Man (2008) #119'));

-- INSERTS PIVOTS # Captain America
INSERT INTO public.character_comic(character_id, comic_id) VALUES((SELECT id FROM public.character WHERE name = 'Captain America'), (SELECT  id FROM public.comic WHERE title = 'Captain America #28'));
INSERT INTO public.character_comic(character_id, comic_id) VALUES((SELECT id FROM public.character WHERE name = 'Captain America'), (SELECT  id FROM public.comic WHERE title = 'Civil War: Marvels Snapshots #1'));
INSERT INTO public.character_creator(character_id, creator_id) VALUES((SELECT id FROM public.character WHERE name = 'Captain America'), (SELECT  id FROM public.creator WHERE name = 'Donny Cates'));
INSERT INTO public.character_creator(character_id, creator_id) VALUES((SELECT id FROM public.character WHERE name = 'Captain America'), (SELECT  id FROM public.creator WHERE name = 'Nick Spencer'));
INSERT INTO public.character_event(character_id, event_id) VALUES((SELECT id FROM public.character WHERE name = 'Captain America'), (SELECT  id FROM public.event WHERE name = 'Civil War'));
INSERT INTO public.character_series(character_id, series_id) VALUES((SELECT id FROM public.character WHERE name = 'Captain America'), (SELECT  id FROM public.series WHERE title = 'Infinity Gauntlet'));
INSERT INTO public.character_story(character_id, story_id) VALUES((SELECT id FROM public.character WHERE name = 'Captain America'), (SELECT  id FROM public.story WHERE title = 'Spider-Man (2008) #119'));

-- INSERTS PIVOTS # Black Panther
INSERT INTO public.character_comic(character_id, comic_id) VALUES((SELECT id FROM public.character WHERE name = 'Black Panther'), (SELECT  id FROM public.comic WHERE title = 'Black Panther and the Agents of Wakanda #7'));
INSERT INTO public.character_comic(character_id, comic_id) VALUES((SELECT id FROM public.character WHERE name = 'Black Panther'), (SELECT  id FROM public.comic WHERE title = 'King In Black: Black Panther #1'));
INSERT INTO public.character_creator(character_id, creator_id) VALUES((SELECT id FROM public.character WHERE name = 'Black Panther'), (SELECT  id FROM public.creator WHERE name = 'Jason Aaron'));
INSERT INTO public.character_creator(character_id, creator_id) VALUES((SELECT id FROM public.character WHERE name = 'Black Panther'), (SELECT  id FROM public.creator WHERE name = 'Nick Spencer'));
INSERT INTO public.character_event(character_id, event_id) VALUES((SELECT id FROM public.character WHERE name = 'Black Panther'), (SELECT  id FROM public.event WHERE name = 'Avengers VS X-men'));
INSERT INTO public.character_series(character_id, series_id) VALUES((SELECT id FROM public.character WHERE name = 'Black Panther'), (SELECT  id FROM public.series WHERE title = 'Infinity Gauntlet'));
INSERT INTO public.character_story(character_id, story_id) VALUES((SELECT id FROM public.character WHERE name = 'Black Panther'), (SELECT  id FROM public.story WHERE title = 'Spider-Man (2008) #119'));