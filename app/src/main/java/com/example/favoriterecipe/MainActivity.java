package com.example.favoriterecipe;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
public class MainActivity extends AppCompatActivity {
    Spinner spinnerList;
    food food;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Add the listener to the list view
        spinnerList = (Spinner) findViewById(R.id.favoriterecipe);
    }
    public void Button1(View view) {
        String sel = spinnerList.getSelectedItem().toString();
        if (sel.equals("poultry")){
            String rec [] = {
                    "CHICKEN STEAK WITH RICOTTA CHEESE AND SPINACH\n\n" +
                            "3 chicken breasts\n" +
                            "1 pack of Ricotta cheese\n" +
                            "2 cubes of frozen spinach\n" +
                            "3 slices of garlic\n" +
                            "4 spoons of grated cheese \"Dþiûgas\"\n" +
                            "Salt\n" +
                            "Black pepper\n" +
                            "Grounded sweet pepper\n" +
                            "Olive oil",
                    "Roast duck legs with red wine sauce:\n\n" +
                            "8 ducks legs\n" +
                            "1 tablespoon 5 spice powder\n" +
                            "lot of rosemary sprigs (a big bunch)\n" +
                            "8 fat garlic cloves\n" +
                            "1 bottle of red wine \n" +
                            "4 tablespoon redcurrant or quince jelly",
                    "Garlic Chicken\n\n"+
                            "2 heads garlic, cloves separated\n" +
                            "8 chicken drumsticks (about 2 1/2 pounds), skin removed, trimmed\n" +
                            "½ teaspoon salt, divided\n" +
                            "¼ teaspoon freshly ground pepper\n" +
                            "3 tablespoons extra-virgin olive oil\n" +
                            "⅓ cup white wine\n" +
                            "1 cup reduced-sodium chicken broth"
            };
            food = new food("poultry","Poultry feed is food for farm poultry, including chickens, ducks, geese and other domestic birds.\n" +
                    "\n" +
                            "Before the twentieth century, poultry were mostly kept on general farms, and foraged for much of their feed, eating insects, grain spilled by cattle and horses, and plants around the farm. This was often supplemented by grain, household scraps, calcium supplements such as oyster shell, and garden waste.",
                    R.drawable.wing,rec
            );
            Intent intent = new Intent(this,Explanaition.class);
            intent.putExtra("food",food.getDescription());
            intent.putExtra("image",food.getImageResourceId());
            startActivity(intent);
        }else if (sel.equals("seafood")){
            String rec [] = {
                    "Chili Cheese Sweet Potato Casserole\n\n" +
                            "4 tbsp. vegetable oil, divided, plus more for dish\n" +
                            "3 medium sweet potatoes (about 1 1/2 lb. total), peeled and cut into 1/2\" cubes\n" +
                            "1 1/2 tsp. kosher salt\n" +
                            "1 yellow onion, finely chopped\n" +
                            "1 red bell pepper, seeds and ribs removed, finely chopped\n" +
                            "2 cloves garlic, finely chopped\n" +
                            "1 tbsp. chili powder\n" +
                            "1 tbsp. ground cumin\n" +
                            "1 tsp. dried oregano\n" +
                            "1 (14.5-oz.) can black beans",
                    "Garlicky Lemon Baked Tilapia:\n\n" +
                            "4 (6-oz.) tilapia fillets\n" +
                            "Kosher salt\n" +
                            "Freshly ground black pepper\n" +
                            "5 tbsp. butter, melted\n" +
                            "2 cloves garlic, minced\n" +
                            "1/4 tsp. red pepper flakes\n" +
                            "Juice and zest from 1/2 lemon\n" +
                            "1 lemon, sliced into rounds\n" +
                            "Freshly chopped parsley, for garnish",
                    "Sheet Pan Shrimp Boil\n\n"+
                            "1 lb. baby red potatoes, quartered\n" +
                            "1 1/2 lb. raw medium shrimp, peeled and deveined\n" +
                            "2 ears of corn, cut crosswise into 4 pieces each\n" +
                            "2 links smoked andouille sausage, thinly sliced\n" +
                            "2 lemons, sliced\n" +
                            "1 tsp. garlic powder\n" +
                            "1 tbsp. Old Bay seasoning"
            };
            food = new food("SeaFood","Seafood is any form of sea life regarded as food by humans, prominently including fish and shellfish. Shellfish include various species of molluscs (e.g. bivalve molluscs such as clams, oysters and mussels, and cephalopods such as octopus and squid), crustaceans (e.g. shrimp, crabs, and lobster), and echinoderms (e.g. sea cucumbers and sea urchins). ",
                    R.drawable.crab,rec
            );
            Intent intent = new Intent(this,Explanaition.class);
            intent.putExtra("food",food.getDescription());
            intent.putExtra("image",food.getImageResourceId());
            startActivity(intent);
        }else if (sel.equals("Vegetarian")){
            String rec [] = {
                    "Extra Vegetable Fried Rice\n\n\n" +
                            "1 ½ teaspoons + 2 tablespoons avocado oil or safflower oil, divided\n" +
                            "2 eggs, whisked together\n" +
                            "1 small white onion, finely chopped (about 1 cup)\n" +
                            "2 medium carrots, finely chopped (about ½ cup)\n" +
                            "2 cups additional veggies",
                    "Best Lentil Soup\n\n" +
                            "¼ cup extra virgin olive oil\n" +
                            "1 medium yellow or white onion, chopped\n" +
                            "2 carrots, peeled and chopped\n" +
                            "4 garlic cloves, pressed or minced\n" +
                            "2 teaspoons ground cumin\n" +
                            "1 teaspoon curry powder\n" +
                            "½ teaspoon dried thyme",
                    "Crispy Falafel\n\n\n"+
                            "¼ cup + 1 tablespoon extra-virgin olive oil\n" +
                            "1 cup dried (uncooked/raw) chickpeas, rinsed, picked over and soaked for at least 4 hours and up to 24 hours in the refrigerator\n" +
            "½ cup roughly chopped red onion (about ½ small red onion)"
 };
            food = new food("SeaFood","Vegetarian cuisine is based on food that meets vegetarian standards by not including meat and animal tissue products (such as gelatin or animal-derived rennet).[1] Lacto-ovo vegetarianism (the most common type of vegetarianism in the Western world) includes eggs and dairy products (such as milk and cheese without rennet). Lacto vegetarianism includes dairy products but not eggs, and ovo vegetarianism encompasses eggs but not dairy products",
            R.drawable.vegan,rec
 );
            Intent intent = new Intent(this,Explanaition.class);
            intent.putExtra("food",food.getDescription());
            intent.putExtra("image",food.getImageResourceId());
            startActivity(intent);
        }else if (sel.equals("Vegan")){
            String rec [] = {
                    "Creamy Vegan Pasta\n\n" +
                            "2½ cups small shell pasta\n" +
                            "1 tablespoon extra-virgin olive oil\n" +
                            "1 small yellow onion, chopped\n" +
                            "5 cups broccoli florets, chopped stems, and leaves (keep stems separate)\n" +
                            "¼ cup toasted pine nuts\n" +
                            "lemon wedges, for serving",
                    "Butternut Squash Stuffed Shells\n\n" +
                            "1½ cups raw cashews*, see note\n" +
                            "1 cup fresh water\n" +
                            "1 garlic clove\n" +
                            "3½ tablespoons fresh lemon juice\n" +
                            "1/2 teaspoon sea salt\n" +
                            "freshly ground pepper",
                    "Spaghetti Bolognese\n\n"+
                            "2 tablespoons extra-virgin olive oil\n" +
                            "½ yellow onion, diced, about 1 cup\n" +
                            "1 medium carrot, diced\n" +
                            "4 cups chopped cremini mushrooms\n" +
                            "1 tablespoon chopped rosemary\n" +
                            "½ cup walnuts, crushed\n" +
                            "2 garlic cloves, minced\n" +
                            "1 tablespoon balsamic vinegar\n" +
                            "1 tablespoon tamari"
            };
            food = new food("vegan","\n" +
                    "A vegan diet is based on plants (such as vegetables, grains, nuts and fruits) and foods made from plants. Vegans do not eat foods that come from animals, including dairy products and eggs",
            R.drawable.vegan,rec
 );
            Intent intent = new Intent(this,Explanaition.class);
            intent.putExtra("food",food.getDescription());
            intent.putExtra("image",food.getImageResourceId());
            startActivity(intent);
        }else if (sel.equals("Italian")){
            String rec [] = {
                    "Carbonara Pizza\n\n" +
                            "1 1/2 tbsp. crushed red chili flakes\n" +
                            "1 garlic clove, grated\n" +
                            "1/2 c. extra-virgin olive oil\n" +
                            "1/4 tsp. Kosher salt",
                    "Easy Chicken Parmesan Recipe\n\n" +
                            "1 1/2 c. panko bread crumbs\n" +
                            "1/2 tsp. garlic powder\n" +
                            "1/4 c. freshly grated Parmesan, plus more for garnish\n" +
                            "2 large eggs, beaten with 1 tbsp. water\n" +
                            "1/2 c. all-purpose flour\n" +
                            "1 1/2 lb. boneless skinless chicken",
                    "Homemade Spaghetti Sauce\n\n"+
                            "1 (28-oz.) can whole peeled tomatoes\n" +
                            "5 tbsp. butter\n" +
                            "1 onion, cut in half\n" +
                            "2 sprigs basil\n" +
                            "2 garlic cloves, peeled and crushed\n" +
                            "1/2 tsp. crushed red pepper flakes\n" +
                            "Kosher salt"
            };
            food = new food("Italian","\n" +
                    "The Mediterranean diet forms the basis of Italian cuisine, rich in pasta, fish, fruits and vegetables. Cheese, cold cuts and wine are central to Italian cuisine, and along with pizza and coffee (especially espresso) form part of Italian gastronomic culture.\n",
                    R.drawable.italian,rec
            );
            Intent intent = new Intent(this,Explanaition.class);
            intent.putExtra("food",food.getDescription());
            intent.putExtra("image",food.getImageResourceId());
            startActivity(intent);
        }
    }
    public void Button2(View view) {
        String sel = spinnerList.getSelectedItem().toString();
        if (sel.equals("poultry")){
            String rec [] = {
                    "CHICKEN STEAK WITH RICOTTA CHEESE AND SPINACH\n\n" +
                            "3 chicken breasts\n" +
                            "1 pack of Ricotta cheese\n" +
                            "2 cubes of frozen spinach\n" +
                            "3 slices of garlic\n" +
                            "4 spoons of grated cheese \"Dþiûgas\"\n" +
                            "Salt\n" +
                            "Black pepper\n" +
                            "Grounded sweet pepper\n" +
                            "Olive oil",
                    "Roast duck legs with red wine sauce:\n\n" +
                            "8 ducks legs\n" +
                            "1 tablespoon 5 spice powder\n" +
                            "lot of rosemary sprigs (a big bunch)\n" +
                            "8 fat garlic cloves\n" +
                            "1 bottle of red wine \n" +
                            "4 tablespoon redcurrant or quince jelly",
                    "Garlic Chicken\n\n"+
                            "2 heads garlic, cloves separated\n" +
                            "8 chicken drumsticks (about 2 1/2 pounds), skin removed, trimmed\n" +
                            "½ teaspoon salt, divided\n" +
                            "¼ teaspoon freshly ground pepper\n" +
                            "3 tablespoons extra-virgin olive oil\n" +
                            "⅓ cup white wine\n" +
                            "1 cup reduced-sodium chicken broth"
            };
            food = new food("poultry","Poultry feed is food for farm poultry, including chickens, ducks, geese and other domestic birds.\n" +
                    "\n" +
                            "Before the twentieth century, poultry were mostly kept on general farms, and foraged for much of their feed, eating insects, grain spilled by cattle and horses, and plants around the farm. This was often supplemented by grain, household scraps, calcium supplements such as oyster shell, and garden waste.",
                    R.drawable.wing,rec
            );
            Intent intent = new Intent(this,Recipies.class);
            intent.putExtra("food",food.getRecipt());
            intent.putExtra("image",food.getImageResourceId());
            startActivity(intent);
        }else if (sel.equals("seafood")){
            String rec [] = {
                    "Chili Cheese Sweet Potato Casserole\n\n" +
                            "4 tbsp. vegetable oil, divided, plus more for dish\n" +
                            "3 medium sweet potatoes (about 1 1/2 lb. total), peeled and cut into 1/2\" cubes\n" +
                            "1 1/2 tsp. kosher salt\n" +
                            "1 yellow onion, finely chopped\n" +
                            "1 red bell pepper, seeds and ribs removed, finely chopped\n" +
                            "2 cloves garlic, finely chopped\n" +
                            "1 tbsp. chili powder\n" +
                            "1 tbsp. ground cumin\n" +
                            "1 tsp. dried oregano\n" +
                            "1 (14.5-oz.) can black beans",
                    "Garlicky Lemon Baked Tilapia:\n\n" +
                            "4 (6-oz.) tilapia fillets\n" +
                            "Kosher salt\n" +
                            "Freshly ground black pepper\n" +
                            "5 tbsp. butter, melted\n" +
                            "2 cloves garlic, minced\n" +
                            "1/4 tsp. red pepper flakes\n" +
                            "Juice and zest from 1/2 lemon\n" +
                            "1 lemon, sliced into rounds\n" +
                            "Freshly chopped parsley, for garnish",
                    "Sheet Pan Shrimp Boil\n\n"+
                            "1 lb. baby red potatoes, quartered\n" +
                            "1 1/2 lb. raw medium shrimp, peeled and deveined\n" +
                            "2 ears of corn, cut crosswise into 4 pieces each\n" +
                            "2 links smoked andouille sausage, thinly sliced\n" +
                            "2 lemons, sliced\n" +
                            "1 tsp. garlic powder\n" +
                            "1 tbsp. Old Bay seasoning"
            };
            food = new food("SeaFood","Seafood is any form of sea life regarded as food by humans, prominently including fish and shellfish. Shellfish include various species of molluscs (e.g. bivalve molluscs such as clams, oysters and mussels, and cephalopods such as octopus and squid), crustaceans (e.g. shrimp, crabs, and lobster), and echinoderms (e.g. sea cucumbers and sea urchins). ",
                    R.drawable.crab,rec
            );
            Intent intent = new Intent(this,Recipies.class);
            intent.putExtra("food",food.getRecipt());
            intent.putExtra("image",food.getImageResourceId());
            startActivity(intent);
        }else if (sel.equals("vegetarian")){
            String rec [] = {
                    "Extra Vegetable Fried Rice\n\n\n" +
                            "1 ½ teaspoons + 2 tablespoons avocado oil or safflower oil, divided\n" +
                            "2 eggs, whisked together\n" +
                            "1 small white onion, finely chopped (about 1 cup)\n" +
                            "2 medium carrots, finely chopped (about ½ cup)\n" +
                            "2 cups additional veggies",
                    "Best Lentil Soup\n\n" +
                            "¼ cup extra virgin olive oil\n" +
                            "1 medium yellow or white onion, chopped\n" +
                            "2 carrots, peeled and chopped\n" +
                            "4 garlic cloves, pressed or minced\n" +
                            "2 teaspoons ground cumin\n" +
                            "1 teaspoon curry powder\n" +
                            "½ teaspoon dried thyme",
                    "Crispy Falafel\n\n\n"+
                            "¼ cup + 1 tablespoon extra-virgin olive oil\n" +
                            "1 cup dried (uncooked/raw) chickpeas, rinsed, picked over and soaked for at least 4 hours and up to 24 hours in the refrigerator\n" +
            "½ cup roughly chopped red onion (about ½ small red onion)"
 };
            food = new food("SeaFood","Vegetarian cuisine is based on food that meets vegetarian standards by not including meat and animal tissue products (such as gelatin or animal-derived rennet).[1] Lacto-ovo vegetarianism (the most common type of vegetarianism in the Western world) includes eggs and dairy products (such as milk and cheese without rennet). Lacto vegetarianism includes dairy products but not eggs, and ovo vegetarianism encompasses eggs but not dairy products",
            R.drawable.vegan,rec
 );
            Intent intent = new Intent(this,Recipies.class);
            intent.putExtra("food",food.getRecipt());
            intent.putExtra("image",food.getImageResourceId());
            startActivity(intent);
        }else if (sel.equals("vegan")){
            String rec [] = {
                    "Creamy Vegan Pasta\n\n" +
                            "2½ cups small shell pasta\n" +
                            "1 tablespoon extra-virgin olive oil\n" +
                            "1 small yellow onion, chopped\n" +
                            "5 cups broccoli florets, chopped stems, and leaves (keep stems separate)\n" +
                            "¼ cup toasted pine nuts\n" +
                            "lemon wedges, for serving",
                    "Butternut Squash Stuffed Shells\n\n" +
                            "1½ cups raw cashews*, see note\n" +
                            "1 cup fresh water\n" +
                            "1 garlic clove\n" +
                            "3½ tablespoons fresh lemon juice\n" +
                            "1/2 teaspoon sea salt\n" +
                            "freshly ground pepper",
                    "Spaghetti Bolognese\n\n"+
                            "2 tablespoons extra-virgin olive oil\n" +
                            "½ yellow onion, diced, about 1 cup\n" +
                            "1 medium carrot, diced\n" +
                            "4 cups chopped cremini mushrooms\n" +
                            "1 tablespoon chopped rosemary\n" +
                            "½ cup walnuts, crushed\n" +
                            "2 garlic cloves, minced\n" +
                            "1 tablespoon balsamic vinegar\n" +
                            "1 tablespoon tamari"
            };
            food = new food("vegan","\n" +
                    "A vegan diet is based on plants (such as vegetables, grains, nuts and fruits) and foods made from plants. Vegans do not eat foods that come from animals, including dairy products and eggs",
            R.drawable.vegan,rec
 );
            Intent intent = new Intent(this,Recipies.class);
            intent.putExtra("food",food.getRecipt());
            intent.putExtra("image",food.getImageResourceId());
            startActivity(intent);
        }else if (sel.equals("Italian")){
            String rec [] = {
                    "Carbonara Pizza\n\n" +
                            "1 1/2 tbsp. crushed red chili flakes\n" +
                            "1 garlic clove, grated\n" +
                            "1/2 c. extra-virgin olive oil\n" +
                            "1/4 tsp. Kosher salt",
                    "Easy Chicken Parmesan Recipe\n\n" +
                            "1 1/2 c. panko bread crumbs\n" +
                            "1/2 tsp. garlic powder\n" +
                            "1/4 c. freshly grated Parmesan, plus more for garnish\n" +
                            "2 large eggs, beaten with 1 tbsp. water\n" +
                            "1/2 c. all-purpose flour\n" +
                            "1 1/2 lb. boneless skinless chicken",
                    "Homemade Spaghetti Sauce\n\n"+
                            "1 (28-oz.) can whole peeled tomatoes\n" +
                            "5 tbsp. butter\n" +
                            "1 onion, cut in half\n" +
                            "2 sprigs basil\n" +
                            "2 garlic cloves, peeled and crushed\n" +
                            "1/2 tsp. crushed red pepper flakes\n" +
                            "Kosher salt"
            };
            food = new food("Italian","\n" +
                    "The Mediterranean diet forms the basis of Italian cuisine, rich in pasta, fish, fruits and vegetables.  Cheese, cold cuts and wine are central to Italian cuisine, and along with pizza and coffee (especially espresso) form part of Italian gastronomic culture.\n",
                    R.drawable.italian,rec
            );
            Intent intent = new Intent(this,Recipies.class);
            intent.putExtra("food",food.getRecipt());
            intent.putExtra("image",food.getImageResourceId());
            startActivity(intent);
        }
    }
}

