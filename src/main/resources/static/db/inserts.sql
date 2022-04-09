INSERT INTO users(username, password, active) VALUES ('admin', '123', true);
INSERT INTO users(username, password, active) VALUES ('user1', 'usr1', false);
INSERT INTO users(username, password, active) VALUES ('user2', 'usr2', false);
INSERT INTO users(username, password, active) VALUES ('user3', 'usr3', false);

insert into roles(role_name) value ('admin');
insert into roles(role_name) value ('user');

insert into users_role (users_user_id, roles)
values (1, 'admin');
insert into users_role (users_user_id, roles)
values (2, 'user');
insert into users_role (users_user_id, roles)
values (3, 'user');
insert into users_role (users_user_id, roles)
values (4, 'user');

INSERT INTO contacts (type, value, users_user_id) VALUES ('email', 'user12345@gmail.com', 2);
INSERT INTO contacts (type, value, users_user_id) VALUES ('email', 'ivan673@gmail.com', 3);
INSERT INTO contacts (type, value, users_user_id) VALUES ('telegram', '8764578208', 2);
INSERT INTO contacts (type, value, users_user_id) VALUES ('telegram', '890345623411', 4);

INSERT INTO dishes_categories(category_name, img) VALUES ('bakery', 'images/bakery.jpg');
INSERT INTO dishes_categories(category_name, img) VALUES ('vegetable', 'images/veg.jpg');
INSERT INTO dishes_categories(category_name, img) VALUES ('fish', 'images/fish.jpg');
INSERT INTO dishes_categories(category_name, img) VALUES ('soup', 'images/soup.jpg');
INSERT INTO dishes_categories(category_name, img) VALUES ('meat', 'images/meat.jpg');
INSERT INTO dishes_categories(category_name, img) VALUES ('snacks', 'images/snacks.jpg');
INSERT INTO dishes_categories(category_name, img) VALUES ('dessert', 'images/dess.jpg');
INSERT INTO dishes_categories(category_name, img) VALUES ('lactose-free', 'images/lact-free.jpg');
INSERT INTO dishes_categories(category_name, img) VALUES ('vegetarian', 'images/vegetarian.jpg');


INSERT INTO advice_categories(category_name) VALUES ('table setting');
INSERT INTO advice_categories(category_name) VALUES ('vegetable');
INSERT INTO advice_categories(category_name) VALUES ('coffee');
INSERT INTO advice_categories(category_name) VALUES ('live hacks');

INSERT INTO dishes(dish_name, dish_descr, dish_img, dishes_categories_id_category) VALUES ('charlotte', 'A charlotte is a type of dessert or trifle that can be served hot or cold. It is also referred to as an "icebox cake". Bread, sponge cake or biscuits/cookies are used to line a mold, which is then filled with a fruit puree or custard. It can also be made using layers of breadcrumbs.', 'images/img1.jpg', 1);
INSERT INTO dishes(dish_name, dish_descr, dish_img, dishes_categories_id_category) VALUES ('cheese soup', 'Cheese soup is a nutritious soup, the main component of which is melted cheese. Cheese soups usually contain a small number of other ingredients. Depending on the recipe, onions, carrots, potatoes, celery, mushrooms, butter, milk, meat broth, and meat products are added to the cheese soup.', 'images/img2.jpg', 4);


INSERT INTO advice (advice_name, advice_text, advice_img, categories_id_category) VALUES ('Rules and order of table setting for dinner','The distance between the chairs is 50-80 cm, each guest should be given equal space at the table. The table should not look overloaded. It should contain only those plates, cutlery and glasses that are suitable for a particular serving of dishes.', '', 1);
INSERT INTO advice (advice_name, advice_text, advice_img, categories_id_category) VALUES ('How to make a cappuccino', 'Classic Italian cappuccino served in a white ceramic cup. Choose a cup that will contain 3 coffee cups of liquid.
Cappuccino will consist of 1 coffee cup of strong coffee and 2 of the same cups of milk. If there is no coffee cup, then simply measure how much liquid is in your tea cup and divide by 3 parts. For example, if a cup contains 150 ml, then for cappuccino we will take 50 ml of coffee and 50 + 50 = 100 ml of milk', '', 4);

INSERT INTO users_has_dishes_categories(users_user_id, dishes_categories_id_category) VALUES (2, 1);
INSERT INTO users_has_dishes_categories(users_user_id, dishes_categories_id_category) VALUES (2, 3);
INSERT INTO users_has_dishes_categories(users_user_id, dishes_categories_id_category) VALUES (2, 5);
INSERT INTO users_has_dishes_categories(users_user_id, dishes_categories_id_category) VALUES (2, 6);
INSERT INTO users_has_dishes_categories(users_user_id, dishes_categories_id_category) VALUES (3, 1);
INSERT INTO users_has_dishes_categories(users_user_id, dishes_categories_id_category) VALUES (3, 2);
INSERT INTO users_has_dishes_categories(users_user_id, dishes_categories_id_category) VALUES (3, 7);
INSERT INTO users_has_dishes_categories(users_user_id, dishes_categories_id_category) VALUES (4, 8);
INSERT INTO users_has_dishes_categories(users_user_id, dishes_categories_id_category) VALUES (4, 9);

INSERT INTO users_has_advice_categories(users_user_id, advice_categories_id_category) VALUES (2, 1);
INSERT INTO users_has_advice_categories(users_user_id, advice_categories_id_category) VALUES (2, 4);
INSERT INTO users_has_advice_categories(users_user_id, advice_categories_id_category) VALUES (3, 1);
INSERT INTO users_has_advice_categories(users_user_id, advice_categories_id_category) VALUES (3, 3);
INSERT INTO users_has_advice_categories(users_user_id, advice_categories_id_category) VALUES (3, 4);
INSERT INTO users_has_advice_categories(users_user_id, advice_categories_id_category) VALUES (4, 2);


INSERT INTO ingredients(ingred_name) VALUES ('water');
INSERT INTO ingredients(ingred_name) VALUES ('salt');
INSERT INTO ingredients(ingred_name) VALUES ('pepper');
INSERT INTO ingredients(ingred_name) VALUES ('sugar');
INSERT INTO ingredients(ingred_name) VALUES ('baking powder');
INSERT INTO ingredients(ingred_name) VALUES ('yeast');
INSERT INTO ingredients(ingred_name) VALUES ('potatoes');
INSERT INTO ingredients(ingred_name) VALUES ('flour');
INSERT INTO ingredients(ingred_name) VALUES ('apple');
INSERT INTO ingredients(ingred_name) VALUES ('lemon');
INSERT INTO ingredients(ingred_name) VALUES ('onion');
INSERT INTO ingredients(ingred_name) VALUES ('cheese');
INSERT INTO ingredients(ingred_name) VALUES ('cream');
INSERT INTO ingredients(ingred_name) VALUES ('milk');
INSERT INTO ingredients(ingred_name) VALUES ('chicken');
INSERT INTO ingredients(ingred_name) VALUES ('egg');
INSERT INTO ingredients(ingred_name) VALUES ('butter');

INSERT INTO measure(measure_name) VALUES ('gramm');
INSERT INTO measure(measure_name) VALUES ('milligram');
INSERT INTO measure(measure_name) VALUES ('cup');
INSERT INTO measure(measure_name) VALUES ('tea spoon');
INSERT INTO measure(measure_name) VALUES ('liter');
INSERT INTO measure(measure_name) VALUES ('milliliter');
INSERT INTO measure(measure_name) VALUES ('piece');

INSERT INTO tags(tag_name) VALUES ('simply');
INSERT INTO tags(tag_name) VALUES ('haute cuisine');
INSERT INTO tags(tag_name) VALUES ('home kitchen');
INSERT INTO tags(tag_name) VALUES ('fruit');
INSERT INTO tags(tag_name) VALUES ('tasty');
INSERT INTO tags(tag_name) VALUES ('quick bite');
INSERT INTO tags(tag_name) VALUES ('sweet');


INSERT INTO recipe(recipe_name, recipe_text, recipe_img, dishes_dish_id) VALUES ('TRADITIONAL APPLE CHARLOTTE', 'Peel, core and thinly slice the apples first of all, rinse them in cold water and put them in a saucepan with the sugar and 1 oz (25 g) of the butter. Cook them over a low heat until they are soft enough to beat into a purée. Beat them and leave on one side to cool. Meanwhile melt the remaining 3 oz (75 g) of butter gently, and cut each slice of bread into rectangles. Next brush each piece of bread with melted butter (both sides), being careful not to leave any unbuttered patches, then line the pudding basin with approximately three-quarters of the bread (or as much as you need). Dont leave any gaps between the pieces – overlap them and press firmly.
When the apple purée has cooled, beat the egg yolk into it and fill the lined basin with the mixture. Finally seal the top with overlapping slices of the remaining bread. Place a suitably sized ovenproof plate on top of the pudding and weight it down with a 2 lb (900 g) scale weight. Meanwhile, pre-heat the oven to gas mark 6, 400°F (200°C).
After 30 minutes place the basin (with the weight still on it) in the oven to bake for 35 minutes. Then, with an oven cloth, remove the plate and weight, and bake the pudding for another 10 minutes to brown on top. Leave the pudding to settle in the basin for a minute after removing from the oven, then carefully invert it on to a warmed plate to serve.', '', 1);
INSERT INTO recipe(recipe_name, recipe_text, recipe_img, dishes_dish_id) VALUES ('Creamy Cheddar Cheese Soup', 'Step 1
In a 3 quart saucepan over medium-high heat, melt butter or margarine. Add onion and cook until tender, about 5 minutes. Stir in flour and cook until flour has blended with onion mixture.

Step 2
Add chicken broth and cook, stirring constantly, until mixture is slightly thickened. Add milk and heat just to boiling, stirring constantly.

Step 3
In covered blender at medium speed, blend about 1/4 of soup mixture at a time until smooth. Return to saucepan and, over medium heat, heat just to boiling. Remove from heat.

Step 4
With wire whisk or slotted spoon, stir in cheese until melted. If cheese does not melt completely, cook over very low heat about 1 minute, stirring constantly.', '', 2);



INSERT INTO recipe_has_tags(recipe_recipe_id, tags_id) VALUES (1, 1);
INSERT INTO recipe_has_tags(recipe_recipe_id, tags_id) VALUES (1, 3);
INSERT INTO recipe_has_tags(recipe_recipe_id, tags_id) VALUES (1, 4);
INSERT INTO recipe_has_tags(recipe_recipe_id, tags_id) VALUES (1, 5);
INSERT INTO recipe_has_tags(recipe_recipe_id, tags_id) VALUES (1, 7);
INSERT INTO recipe_has_tags(recipe_recipe_id, tags_id) VALUES (2, 1);
INSERT INTO recipe_has_tags(recipe_recipe_id, tags_id) VALUES (2, 3);

INSERT INTO recipe_has_ingredients(recipe_recipe_id, ingredients_ingred_id, count, measure_id) VALUES (1, 10, 5, 7);
INSERT INTO recipe_has_ingredients(recipe_recipe_id, ingredients_ingred_id, count, measure_id) VALUES (1, 5, 1, 4);
INSERT INTO recipe_has_ingredients(recipe_recipe_id, ingredients_ingred_id, count, measure_id) VALUES (1, 18, 110, 1);
INSERT INTO recipe_has_ingredients(recipe_recipe_id, ingredients_ingred_id, count, measure_id) VALUES (1, 9, 200, 1);
INSERT INTO recipe_has_ingredients(recipe_recipe_id, ingredients_ingred_id, count, measure_id) VALUES (1, 17, 2, 7);

INSERT INTO recipe_has_ingredients(recipe_recipe_id, ingredients_ingred_id, count, measure_id) VALUES (2, 2, 1, 5);
INSERT INTO recipe_has_ingredients(recipe_recipe_id, ingredients_ingred_id, count, measure_id) VALUES (2, 13, 400, 1);
INSERT INTO recipe_has_ingredients(recipe_recipe_id, ingredients_ingred_id, count, measure_id) VALUES (2, 8, 3, 7);
INSERT INTO recipe_has_ingredients(recipe_recipe_id, ingredients_ingred_id, count, measure_id) VALUES (2, 3, 5, 2);
INSERT INTO recipe_has_ingredients(recipe_recipe_id, ingredients_ingred_id, count, measure_id) VALUES (2, 4, 5, 2);

INSERT INTO dishes(dish_name, dish_descr, dish_img, dishes_categories_id_category) VALUES ('pizza', 'A dish made typically of flattened bread dough spread with a savory mixture usually including tomatoes and cheese and often other toppings and baked. — called also pizza pie. Other Words from pizza Example Sentences Learn More About pizza.', 'images/pizza.jpg', 1);