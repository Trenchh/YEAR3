<?php include_once('/home/17rcp/public_html/a5/inc/functions.php'); ?>
<?php include_once('/home/17rcp/public_html/a5/inc/search.php'); ?>

<!DOCTYPE html>
<html lang="en">

<?php print_head("Department of Agriculture | Search Results", FALSE) ?>

<body>

	<?php include('/home/17rcp/public_html/a5/inc/header.php') ?>
	
	<main>
        <h1>Search Results</h1>

        <p>
            <?php 
            $query=$_GET["searchQuery"];
            $query = trim($query);
            $query = filter_var($query, FILTER_SANITIZE_FULL_SPECIAL_CHARS);
            $resultsArray=search_for_term($query);
            if(count($resultsArray) > 0) {
                echo 'Your search for "'.$query.'" produced '.count($resultsArray).' result(s).';
            } else {
                echo 'Sorry, but there were no matches for "'.$query.'".';
            }
            ?>
        </p>
        <ul>
            <?php
            foreach($resultsArray as $result)
            echo '<li><a href="'.$result["link"].'">'.$result["type"].'</a></li>';
            ?>
        </ul>

    </main>

	<?php include('/home/17rcp/public_html/a5/inc/footer.php') ?>
</body>
</html>