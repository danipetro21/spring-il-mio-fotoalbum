INSERT INTO foto (title, url, descr, visible) VALUES ('Alba sul mare', 'https://www.lidodiclasse.com/wp-content/uploads/foto/photo-gallery/Alba_mare/IMG_8636.jpg', 'Uno splendido spettacolo di colori all alba sulla costa', true);
INSERT INTO foto (title, url, descr, visible) VALUES ('Riflesso urbano', 'https://img.freepik.com/premium-photo/cityscape-with-reflection-skyline-trees_717440-7779.jpg', 'Un riflesso mozzafiato di grattacieli nella città', true);
INSERT INTO foto (title, url, descr, visible) VALUES ('Natura selvaggia', 'https://gimli.freetls.fastly.net/vivitravels/content/1024x680/temi/images/natura-selvaggia-tema.jpg', 'Un paesaggio incontaminato con flora e fauna selvatica', true);
INSERT INTO foto (title, url, descr, visible) VALUES ('Antichi sentieri', 'https://www.italiachecambia.org/wp-content/uploads/2021/03/antichi-sentieri-liguri-1024x537.jpg', 'Un viaggio attraverso antichi sentieri ricchi di storia', true);
INSERT INTO foto (title, url, descr, visible) VALUES ('Momento di tranquillità', 'https://www.donnamoderna.com/content/uploads/2017/06/4389352-come-trovare-pace-interiore.jpg', 'Un momento di pace e serenità in un luogo incantevole', true);
INSERT INTO foto (title, url, descr, visible) VALUES ('Ritratto emozionale', 'https://www.enricoduratorre.it/media/imagecache/allegati/14c4fbbc61/ritratto.jpg.jpg', 'Un ritratto che cattura un emozione intensa', true);
INSERT INTO foto (title, url, descr, visible) VALUES ('Vita sottomarina', 'https://www.buvu.it/files/e/59229/poster-vita-sottomarina-tartarughe-e-coralli.jpeg', 'La meravigliosa varietà di vita sottomarina nei mari', true);
INSERT INTO foto (title, url, descr, visible) VALUES ('Street art urbana', 'https://www.travelonart.com/wp-content/uploads/2023/01/street-art-e-riqualificazione-urbana-copertina.jpg', 'Opere d arte colorate e creative sulle strade della città', true);
INSERT INTO foto (title, url, descr, visible) VALUES ('Viaggio nel tempo', 'https://www.massimopolidoro.com/misteri-massimo-polidoro/2017/07/timetravel.jpg', 'Un viaggio che attraversa epoche storiche e luoghi suggestivi', true);
INSERT INTO foto (title, url, descr, visible) VALUES ('Armonia naturale', 'https://www.ecolovers.it/wp-content/uploads/2023/05/pexels-los-muertos-crew-7177725-1.jpg', 'Un equilibrio perfetto tra elementi naturali', true);
INSERT INTO foto (title, url, descr, visible) VALUES ('Magia notturna', 'https://www.orvietonews.it/upload/immagini/2021/06/lucciole_radura-87537.jpg', 'Le luci della notte creano un atmosfera incantata', true);
INSERT INTO foto (title, url, descr, visible) VALUES ('Espressione artistica', 'https://img.freepik.com/premium-photo/concept-creative-ideas-artistic-expression-illustrated-through-abstract-image_866663-48.jpg', 'Un opera d arte che si manifesta attraverso colori e forme', true);
INSERT INTO foto (title, url, descr, visible) VALUES ('Rituali tradizionali', 'https://scontent.ccdn.cloud/image/vivitravels-it/1a587385-04c3-4ad5-90c5-3855c369c903/1200x630.jpg', 'Momenti di rito e tradizione che preservano la cultura', true);
INSERT INTO foto (title, url, descr, visible) VALUES ('Sentieri di montagna', 'https://www.redelk.it/wp-content/uploads/2021/11/I-10-sentieri-di-montagna-piu-belli.jpg', 'Un avventura attraverso i sentieri alpini', true);




INSERT INTO categoria (name) VALUES ('Paesaggi');
INSERT INTO categoria (name) VALUES ('Ritratti');
INSERT INTO categoria (name) VALUES ('Natura');
INSERT INTO categoria (name) VALUES ('Architettura');
INSERT INTO categoria (name) VALUES ('Rituali');
INSERT INTO categoria (name) VALUES ('Eventi');
INSERT INTO categoria (name) VALUES ('Viaggi');
INSERT INTO categoria (name) VALUES ('Animali');
INSERT INTO categoria (name) VALUES ('Street Photography');
INSERT INTO categoria (name) VALUES ('Macro');
INSERT INTO categoria (name) VALUES ('Bianco e Nero');
INSERT INTO categoria (name) VALUES ('Astronomia');
INSERT INTO categoria (name) VALUES ('Cibo');
INSERT INTO categoria (name) VALUES ('Moda');
INSERT INTO categoria (name) VALUES ('Sport');



INSERT INTO foto_categoria (foto_id, categoria_id) VALUES (1, 1);
INSERT INTO foto_categoria (foto_id, categoria_id) VALUES (1, 2);
INSERT INTO foto_categoria (foto_id, categoria_id) VALUES (2, 3);
INSERT INTO foto_categoria (foto_id, categoria_id) VALUES (3, 4);
INSERT INTO foto_categoria (foto_id, categoria_id) VALUES (3, 5);
INSERT INTO foto_categoria (foto_id, categoria_id) VALUES (4, 1);
INSERT INTO foto_categoria (foto_id, categoria_id) VALUES (4, 6);
INSERT INTO foto_categoria (foto_id, categoria_id) VALUES (5, 2);
INSERT INTO foto_categoria (foto_id, categoria_id) VALUES (5, 3);
INSERT INTO foto_categoria (foto_id, categoria_id) VALUES (5, 7);
INSERT INTO foto_categoria (foto_id, categoria_id) VALUES (6, 1);
INSERT INTO foto_categoria (foto_id, categoria_id) VALUES (7, 8);
INSERT INTO foto_categoria (foto_id, categoria_id) VALUES (8, 9);
INSERT INTO foto_categoria (foto_id, categoria_id) VALUES (9, 10);
INSERT INTO foto_categoria (foto_id, categoria_id) VALUES (9, 11);
INSERT INTO foto_categoria (foto_id, categoria_id) VALUES (10, 1);
INSERT INTO foto_categoria (foto_id, categoria_id) VALUES (11, 2);
INSERT INTO foto_categoria (foto_id, categoria_id) VALUES (12, 3);
INSERT INTO foto_categoria (foto_id, categoria_id) VALUES (13, 4);
INSERT INTO foto_categoria (foto_id, categoria_id) VALUES (13, 12)



INSERT INTO roles (id, name) VALUES(1,'ADMIN');
INSERT INTO roles (id, name) VALUES(2,'USER');
INSERT INTO users (id, email, first_name, last_name, password) VALUES(1, 'john@email.com', 'John', 'Doe', '{noop}john');
INSERT INTO users (id, email, first_name, last_name, password) VALUES(2, 'jane@email.com', 'Jane', 'Doe', '{noop}jane');
INSERT INTO users_roles (roles_id, user_id) VALUES(1, 1);
INSERT INTO users_roles (roles_id, user_id) VALUES(2, 2);