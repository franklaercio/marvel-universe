-- INSERTS CHARACTER
INSERT INTO public.character(id, name, description, modified) VALUES(nextval('character_seq'), 'Thor', 'Son of Odin', CURRENT_TIMESTAMP);
INSERT INTO public.character(id, name, description, modified) VALUES(nextval('character_seq'), 'Iron Man', 'Billionaire and philanthropist', CURRENT_TIMESTAMP);
INSERT INTO public.character(id, name, description, modified) VALUES(nextval('character_seq'), 'Hulk', 'Hulk Smash!', CURRENT_TIMESTAMP);

-- INSERTS COMICS
INSERT INTO public.comic(id,title, digital_id, issue_number, upc, diamond_code, format, page_count, modified) VALUES(nextval('comic_seq'), 'Thor', 10582, 13, '5960604745-11711', 'MAY082311', 'Comic', '0', CURRENT_TIMESTAMP);
INSERT INTO public.comic(id,title, digital_id, issue_number, upc, diamond_code, format, page_count, modified) VALUES(nextval('comic_seq'), 'Iron Man', 10584, 1, '5960604745-11712', 'MAY082313', 'Comic', '0', CURRENT_TIMESTAMP);
INSERT INTO public.comic(id,title, digital_id, issue_number, upc, diamond_code, format, page_count, modified) VALUES(nextval('comic_seq'), 'Immortal Huck', 10586, 1, '5960604745-11713', 'MAY082314', 'Comic', '0', CURRENT_TIMESTAMP);

-- INSERTS CREATORS
INSERT INTO public.creator(id, name, modified) VALUES(nextval('creator_seq'), 'Jason Aaron', CURRENT_TIMESTAMP);
INSERT INTO public.creator(id, name, modified) VALUES(nextval('creator_seq'), 'Saladin Ahmed', CURRENT_TIMESTAMP);
INSERT INTO public.creator(id, name, modified) VALUES(nextval('creator_seq'), 'Nick Spencer', CURRENT_TIMESTAMP);

-- INSERTS EVENT
INSERT INTO public.event(id, name, description, start_event, end_event, modified) VALUES(nextval('event_seq'), 'Secret Wars', 'Time Runs Out. Everything Ends. The Secret Wars commence in May 2015 from Jonathan Hickman and Esad Ribic!', '2015-05-01', '2015-12-01', CURRENT_TIMESTAMP);
INSERT INTO public.event(id, name, description, start_event, end_event, modified) VALUES(nextval('event_seq'), 'Civil War', 'After a horrific tragedy raises questions on whether or not super heroes should register with the government!', '2006-06-01', '2007-06-01', CURRENT_TIMESTAMP);
INSERT INTO public.event(id, name, description, start_event, end_event, modified) VALUES(nextval('event_seq'), 'Avengers VS X-men', 'A 12-issue event written by the unprecedented team of Brian Michael Bendis, Jason Aaron, Jonathan Hickman!', '2012-04-01', '2012-09-01', CURRENT_TIMESTAMP);

-- INSERTS SERIES
INSERT INTO public.series(id, title, description, start_year, modified) VALUES(nextval('series_seq'), 'Avengers', 'Earth Mightiest Heroes', 2018, CURRENT_TIMESTAMP);
INSERT INTO public.series(id, title, description, start_year, modified) VALUES(nextval('series_seq'), 'Infinity Gauntlet', 1991, 1991, CURRENT_TIMESTAMP);
INSERT INTO public.series(id, title, description, start_year, modified) VALUES(nextval('series_seq'), 'The Amazing Spider-Man', '', 2018, CURRENT_TIMESTAMP);

-- INSERTS STORY
INSERT INTO public.story(id,title, description, type, modified) VALUES(nextval('story_seq'), 'Thor (2008) #121', 'This is a very good story!', 'principal', CURRENT_TIMESTAMP);
INSERT INTO public.story(id,title, description, type, modified) VALUES(nextval('story_seq'), 'Iron Man (2008) #118', 'This is a very good story!', 'principal', CURRENT_TIMESTAMP);
INSERT INTO public.story(id,title, description, type, modified) VALUES(nextval('story_seq'), 'Incredible Huck (2008) #117', 'This is a very good story!', 'principal', CURRENT_TIMESTAMP);

-- INSERTS PIVOTS # Thor
INSERT INTO public.character_comic(character_id, comic_id) VALUES((SELECT id FROM public.character WHERE name = 'Thor'), (SELECT id FROM public.comic WHERE title = 'Thor'));
INSERT INTO public.character_creator(character_id, creator_id) VALUES((SELECT id FROM public.character WHERE name = 'Thor'), (SELECT id FROM public.creator WHERE name = 'Jason Aaron'));
INSERT INTO public.character_event(character_id, event_id) VALUES((SELECT id FROM public.character WHERE name = 'Thor'), (SELECT id FROM public.event WHERE name = 'Secret War'));
INSERT INTO public.character_series(character_id, series_id) VALUES((SELECT id FROM public.character WHERE name = 'Thor'), (SELECT  id FROM public.series WHERE title = 'Avengers'));
INSERT INTO public.character_story(character_id, story_id) VALUES((SELECT id FROM public.character WHERE name = 'Thor'), (SELECT  id FROM public.story WHERE title = 'Thor (2008) #121'));

-- INSERTS PIVOTS # Iron Man
INSERT INTO public.character_comic(character_id,comic_id) VALUES((SELECT id FROM public.character WHERE name = 'Iron Man'), (SELECT  id FROM public.comic WHERE title = 'Iron Man'));
INSERT INTO public.character_creator(character_id, creator_id) VALUES((SELECT id FROM public.character WHERE name = 'Iron Man'), (SELECT  id FROM public.creator WHERE name = 'Saladin Ahmed'));
INSERT INTO public.character_event(character_id, event_id) VALUES((SELECT id FROM public.character WHERE name = 'Iron Man'), (SELECT  id FROM public.event WHERE name = 'Civil War'));
INSERT INTO public.character_series(character_id, series_id) VALUES((SELECT id FROM public.character WHERE name = 'Iron Man'), (SELECT  id FROM public.series WHERE title = 'Infinity Gauntlet'));
INSERT INTO public.character_story(character_id, story_id) VALUES((SELECT id FROM public.character WHERE name = 'Iron Man'), (SELECT  id FROM public.story WHERE title = 'Iron Man (2008) #118'));

-- INSERTS PIVOTS # Hulk
INSERT INTO public.character_comic(character_id, comic_id) VALUES((SELECT id FROM public.character WHERE name = 'Hulk'), (SELECT  id FROM public.comic WHERE title = 'Immortal Huck'));
INSERT INTO public.character_creator(character_id, creator_id) VALUES((SELECT id FROM public.character WHERE name = 'Hulk'), (SELECT  id FROM public.creator WHERE name = 'Nick Spencer'));
INSERT INTO public.character_event(character_id, event_id) VALUES((SELECT id FROM public.character WHERE name = 'Hulk'), (SELECT  id FROM public.event WHERE name = 'Avengers VS X-men'));
INSERT INTO public.character_series(character_id, series_id) VALUES((SELECT id FROM public.character WHERE name = 'Hulk'), (SELECT  id FROM public.series WHERE title = 'The Amazing Spider-Man'));
INSERT INTO public.character_story(character_id, story_id) VALUES((SELECT id FROM public.character WHERE name = 'Hulk'), (SELECT  id FROM public.story WHERE title = 'Incredible Huck (2008) #117'));

-- INSERTS PIVOT EVENT
INSERT INTO public.event_character(event_id, character_id) VALUES((SELECT id FROM public.event WHERE name = 'Secret Wars'), (SELECT  id FROM public.character WHERE name = 'Iron Man'));
INSERT INTO public.event_character(event_id, character_id) VALUES((SELECT id FROM public.event WHERE name = 'Civil War'), (SELECT  id FROM public.character WHERE name = 'Thor'));
INSERT INTO public.event_character(event_id, character_id) VALUES((SELECT id FROM public.event WHERE name = 'Avengers VS X-men'), (SELECT  id FROM public.character WHERE name = 'Hulk'));
INSERT INTO public.event_creator(event_id, creator_id) VALUES((SELECT id FROM public.event WHERE name = 'Secret Wars'), (SELECT  id FROM public.creator WHERE name = 'Jason Aaron'));
INSERT INTO public.event_creator(event_id, creator_id) VALUES((SELECT id FROM public.event WHERE name = 'Civil War'), (SELECT  id FROM public.creator WHERE name = 'Saladin Ahmed'));
INSERT INTO public.event_creator(event_id, creator_id) VALUES((SELECT id FROM public.event WHERE name = 'Avengers VS X-men'), (SELECT  id FROM public.creator WHERE name = 'Nick Spencer'));
INSERT INTO public.event_comic(event_id, comic_id) VALUES((SELECT id FROM public.event WHERE name = 'Secret Wars'), (SELECT  id FROM public.comic WHERE title = 'Thor'));
INSERT INTO public.event_comic(event_id, comic_id) VALUES((SELECT id FROM public.event WHERE name = 'Civil War'), (SELECT  id FROM public.comic WHERE title = 'Iron Man'));
INSERT INTO public.event_comic(event_id, comic_id) VALUES((SELECT id FROM public.event WHERE name = 'Avengers VS X-men'), (SELECT  id FROM public.comic WHERE title = 'Immortal Huck'));
INSERT INTO public.event_series(event_id, series_id) VALUES((SELECT id FROM public.event WHERE name = 'Secret Wars'), (SELECT  id FROM public.series WHERE title = 'Avengers'));
INSERT INTO public.event_series(event_id, series_id) VALUES((SELECT id FROM public.event WHERE name = 'Civil War'), (SELECT  id FROM public.series WHERE title = 'Infinity Gauntlet'));
INSERT INTO public.event_series(event_id, series_id) VALUES((SELECT id FROM public.event WHERE name = 'Avengers VS X-men'), (SELECT  id FROM public.series WHERE title = 'The Amazing Spider-Man'));
INSERT INTO public.event_story(event_id, story_id) VALUES((SELECT id FROM public.event WHERE name = 'Secret Wars'), (SELECT  id FROM public.story WHERE title = 'Thor (2008) #121'));
INSERT INTO public.event_story(event_id, story_id) VALUES((SELECT id FROM public.event WHERE name = 'Civil War'), (SELECT  id FROM public.story WHERE title = 'Iron Man (2008) #118'));
INSERT INTO public.event_story(event_id, story_id) VALUES((SELECT id FROM public.event WHERE name = 'Avengers VS X-men'), (SELECT  id FROM public.story WHERE title = 'Incredible Huck (2008) #117'));

-- INSERTS PIVOT CREATORS
INSERT INTO public.creator_character(creator_id, character_id) VALUES((SELECT id FROM public.creator WHERE name = 'Jason Aaron'), (SELECT  id FROM public.character WHERE name = 'Thor'));
INSERT INTO public.creator_character(creator_id, character_id) VALUES((SELECT id FROM public.creator WHERE name = 'Saladin Ahmed'), (SELECT  id FROM public.character WHERE name = 'Iron Man'));
INSERT INTO public.creator_character(creator_id, character_id) VALUES((SELECT id FROM public.creator WHERE name = 'Nick Spencer'), (SELECT  id FROM public.character WHERE name = 'Hulk'));
INSERT INTO public.creator_event(creator_id, event_id) VALUES((SELECT id FROM public.creator WHERE name = 'Jason Aaron'), (SELECT  id FROM public.event WHERE name = 'Secret Wars'));
INSERT INTO public.creator_event(creator_id, event_id) VALUES((SELECT id FROM public.creator WHERE name = 'Saladin Ahmed'), (SELECT  id FROM public.event WHERE name = 'Civil War'));
INSERT INTO public.creator_event(creator_id, event_id) VALUES((SELECT id FROM public.creator WHERE name = 'Nick Spencer'), (SELECT  id FROM public.event WHERE name = 'Avengers VS X-men'));
INSERT INTO public.creator_comic(creator_id, comic_id) VALUES((SELECT id FROM public.creator WHERE name = 'Jason Aaron'), (SELECT  id FROM public.comic WHERE title = 'Thor'));
INSERT INTO public.creator_comic(creator_id, comic_id) VALUES((SELECT id FROM public.creator WHERE name = 'Saladin Ahmed'), (SELECT  id FROM public.comic WHERE title = 'Iron Man'));
INSERT INTO public.creator_comic(creator_id, comic_id) VALUES((SELECT id FROM public.creator WHERE name = 'Nick Spencer'), (SELECT  id FROM public.comic WHERE title = 'Immortal Huck'));
INSERT INTO public.creator_series(creator_id, series_id) VALUES((SELECT id FROM public.creator WHERE name = 'Jason Aaron'), (SELECT  id FROM public.series WHERE title = 'Avengers'));
INSERT INTO public.creator_series(creator_id, series_id) VALUES((SELECT id FROM public.creator WHERE name = 'Saladin Ahmed'), (SELECT  id FROM public.series WHERE title = 'Infinity Gauntlet'));
INSERT INTO public.creator_series(creator_id, series_id) VALUES((SELECT id FROM public.creator WHERE name = 'Nick Spencer'), (SELECT  id FROM public.series WHERE title = 'The Amazing Spider-Man'));
INSERT INTO public.creator_story(creator_id, story_id) VALUES((SELECT id FROM public.creator WHERE name = 'Jason Aaron'), (SELECT  id FROM public.story WHERE title = 'Thor (2008) #121'));
INSERT INTO public.creator_story(creator_id, story_id) VALUES((SELECT id FROM public.creator WHERE name = 'Saladin Ahmed'), (SELECT  id FROM public.story WHERE title = 'Iron Man (2008) #118'));
INSERT INTO public.creator_story(creator_id, story_id) VALUES((SELECT id FROM public.creator WHERE name = 'Nick Spencer'), (SELECT  id FROM public.story WHERE title = 'Incredible Huck (2008) #117'));

-- INSERTS PIVOT SERIES
INSERT INTO public.series_comic(series_id, comic_id) VALUES((SELECT id FROM public.series WHERE title = 'Avengers'), (SELECT  id FROM public.comic WHERE title = 'Thor'));
INSERT INTO public.series_comic(series_id, comic_id) VALUES((SELECT id FROM public.series WHERE title = 'Infinity Gauntlet'), (SELECT  id FROM public.comic WHERE title = 'Iron Man'));
INSERT INTO public.series_comic(series_id, comic_id) VALUES((SELECT id FROM public.series WHERE title = 'The Amazing Spider-Man'), (SELECT  id FROM public.comic WHERE title = 'Immortal Huck'));
INSERT INTO public.series_creator(series_id, creator_id) VALUES((SELECT id FROM public.series WHERE title = 'Avengers'), (SELECT  id FROM public.creator WHERE name = 'Jason Aaron'));
INSERT INTO public.series_creator(series_id, creator_id) VALUES((SELECT id FROM public.series WHERE title = 'Infinity Gauntlet'), (SELECT  id FROM public.creator WHERE name = 'Saladin Ahmed'));
INSERT INTO public.series_creator(series_id, creator_id) VALUES((SELECT id FROM public.series WHERE title = 'The Amazing Spider-Man'), (SELECT  id FROM public.creator WHERE name = 'Nick Spencer'));
INSERT INTO public.series_event(series_id, event_id) VALUES((SELECT id FROM public.series WHERE title = 'Avengers'), (SELECT  id FROM public.event WHERE name = 'Secret Wars'));
INSERT INTO public.series_event(series_id, event_id) VALUES((SELECT id FROM public.series WHERE title = 'Infinity Gauntlet'), (SELECT  id FROM public.event WHERE name = 'Civil War'));
INSERT INTO public.series_event(series_id, event_id) VALUES((SELECT id FROM public.series WHERE title = 'The Amazing Spider-Man'), (SELECT  id FROM public.event WHERE name = 'Avengers VS X-men'));
INSERT INTO public.series_character(series_id, character_id) VALUES((SELECT id FROM public.series WHERE title = 'Avengers'), (SELECT  id FROM public.character WHERE name = 'Thor'));
INSERT INTO public.series_character(series_id, character_id) VALUES((SELECT id FROM public.series WHERE title = 'Infinity Gauntlet'), (SELECT  id FROM public.character WHERE name = 'Iron Man'));
INSERT INTO public.series_character(series_id, character_id) VALUES((SELECT id FROM public.series WHERE title = 'The Amazing Spider-Man'), (SELECT  id FROM public.character WHERE name = 'Hulk'));
INSERT INTO public.series_story(series_id, story_id) VALUES((SELECT id FROM public.series WHERE title = 'Avengers'), (SELECT  id FROM public.story WHERE title = 'Thor (2008) #121'));
INSERT INTO public.series_story(series_id, story_id) VALUES((SELECT id FROM public.series WHERE title = 'Infinity Gauntlet'), (SELECT  id FROM public.story WHERE title = 'Iron Man (2008) #118'));
INSERT INTO public.series_story(series_id, story_id) VALUES((SELECT id FROM public.series WHERE title = 'The Amazing Spider-Man'), (SELECT  id FROM public.story WHERE title = 'The Amazing Spider-Man'));

-- INSERTS PIVOT STORIES
INSERT INTO public.story_comic(story_id, comic_id) VALUES((SELECT id FROM public.story WHERE title = 'Thor (2008) #121'), (SELECT  id FROM public.comic WHERE title = 'Thor'));
INSERT INTO public.story_comic(story_id, comic_id) VALUES((SELECT id FROM public.story WHERE title = 'Iron Man (2008) #118'), (SELECT  id FROM public.comic WHERE title = 'Iron Man'));
INSERT INTO public.story_comic(story_id, comic_id) VALUES((SELECT id FROM public.story WHERE title = 'Incredible Huck (2008) #117'), (SELECT  id FROM public.comic WHERE title = 'Immortal Huck'));
INSERT INTO public.story_creator(story_id, creator_id) VALUES((SELECT id FROM public.story WHERE title = 'Thor (2008) #121'), (SELECT  id FROM public.creator WHERE name = 'Jason Aaron'));
INSERT INTO public.story_creator(story_id, creator_id) VALUES((SELECT id FROM public.story WHERE title = 'Iron Man (2008) #118'), (SELECT  id FROM public.creator WHERE name = 'Saladin Ahmed'));
INSERT INTO public.story_creator(story_id, creator_id) VALUES((SELECT id FROM public.story WHERE title = 'Incredible Huck (2008) #117'), (SELECT  id FROM public.creator WHERE name = 'Nick Spencer'));
INSERT INTO public.story_event(story_id, event_id) VALUES((SELECT id FROM public.story WHERE title = 'Thor (2008) #121'), (SELECT  id FROM public.event WHERE name = 'Secret Wars'));
INSERT INTO public.story_event(story_id, event_id) VALUES((SELECT id FROM public.story WHERE title = 'Iron Man (2008) #118'), (SELECT  id FROM public.event WHERE name = 'Civil War'));
INSERT INTO public.story_event(story_id, event_id) VALUES((SELECT id FROM public.story WHERE title = 'Incredible Huck (2008) #117'), (SELECT  id FROM public.event WHERE name = 'Avengers VS X-men'));
INSERT INTO public.story_character(story_id, character_id) VALUES((SELECT id FROM public.story WHERE title = 'Thor (2008) #121'), (SELECT  id FROM public.character WHERE name = 'Thor'));
INSERT INTO public.story_character(story_id, character_id) VALUES((SELECT id FROM public.story WHERE title = 'Iron Man (2008) #118'), (SELECT  id FROM public.character WHERE name = 'Iron Man'));
INSERT INTO public.story_character(story_id, character_id) VALUES((SELECT id FROM public.story WHERE title = 'Incredible Huck (2008) #117'), (SELECT  id FROM public.character WHERE name = 'Hulk'));
INSERT INTO public.story_series(story_id, series_id) VALUES((SELECT id FROM public.story WHERE title = 'Thor (2008) #121'), (SELECT  id FROM public.series WHERE title = 'Avengers'));
INSERT INTO public.story_series(story_id, series_id) VALUES((SELECT id FROM public.story WHERE title = 'Iron Man (2008) #118'), (SELECT  id FROM public.series WHERE title = 'Infinity Gauntlet'));
INSERT INTO public.story_series(story_id, series_id) VALUES((SELECT id FROM public.story WHERE title = 'Incredible Huck (2008) #117'), (SELECT  id FROM public.series WHERE title = 'The Amazing Spider-Man'));

-- INSERTS PIVOT COMIC
INSERT INTO public.comic_story(comic_id, story_id) VALUES((SELECT id FROM public.comic WHERE title = 'Thor'), (SELECT  id FROM public.story WHERE title = 'Thor'));
INSERT INTO public.comic_story(comic_id, story_id) VALUES((SELECT id FROM public.comic WHERE title = 'Iron Man'), (SELECT  id FROM public.story WHERE title = 'Iron Man'));
INSERT INTO public.comic_story(comic_id, story_id) VALUES((SELECT id FROM public.comic WHERE title = 'Immortal Huck'), (SELECT  id FROM public.story WHERE title = 'Immortal Huck'));
INSERT INTO public.comic_creator(comic_id, creator_id) VALUES((SELECT id FROM public.comic WHERE title = 'Thor'), (SELECT  id FROM public.creator WHERE name = 'Jason Aaron'));
INSERT INTO public.comic_creator(comic_id, creator_id) VALUES((SELECT id FROM public.comic WHERE title = 'Iron Man'), (SELECT  id FROM public.creator WHERE name = 'Saladin Ahmed'));
INSERT INTO public.comic_creator(comic_id, creator_id) VALUES((SELECT id FROM public.comic WHERE title = 'Immortal Huck'), (SELECT  id FROM public.creator WHERE name = 'Nick Spencer'));
INSERT INTO public.comic_event(comic_id, event_id) VALUES((SELECT id FROM public.comic WHERE title = 'Thor'), (SELECT  id FROM public.event WHERE name = 'Secret Wars'));
INSERT INTO public.comic_event(comic_id, event_id) VALUES((SELECT id FROM public.comic WHERE title = 'Iron Man'), (SELECT  id FROM public.event WHERE name = 'Civil War'));
INSERT INTO public.comic_event(comic_id, event_id) VALUES((SELECT id FROM public.comic WHERE title = 'Immortal Huck'), (SELECT  id FROM public.event WHERE name = 'Avengers VS X-men'));
INSERT INTO public.comic_character(comic_id, character_id) VALUES((SELECT id FROM public.comic WHERE title = 'Thor'), (SELECT  id FROM public.character WHERE name = 'Thor'));
INSERT INTO public.comic_character(comic_id, character_id) VALUES((SELECT id FROM public.comic WHERE title = 'Iron Man'), (SELECT  id FROM public.character WHERE name = 'Iron Man'));
INSERT INTO public.comic_character(comic_id, character_id) VALUES((SELECT id FROM public.comic WHERE title = 'Immortal Huck'), (SELECT  id FROM public.character WHERE name = 'Hulk'));
INSERT INTO public.comic_series(comic_id, series_id) VALUES((SELECT id FROM public.comic WHERE title = 'Thor'), (SELECT  id FROM public.series WHERE title = 'Avengers'));
INSERT INTO public.comic_series(comic_id, series_id) VALUES((SELECT id FROM public.comic WHERE title = 'Iron Man'), (SELECT  id FROM public.series WHERE title = 'Infinity Gauntlet'));
INSERT INTO public.comic_series(comic_id, series_id) VALUES((SELECT id FROM public.comic WHERE title = 'Immortal Huck'), (SELECT  id FROM public.series WHERE title = 'The Amazing Spider-Man'));