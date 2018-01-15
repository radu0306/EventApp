$(function () {

    function initMap() {

        var location = new google.maps.LatLng(44.439663, 26.096306);

    	 var loc = {};

    	 
    	
        var mapCanvas = document.getElementById('map');
        var mapOptions = {
            center: location,
            zoom: 16,
            panControl: false,
            mapTypeId: google.maps.MapTypeId.ROADMAP
        }
        var map = new google.maps.Map(mapCanvas, mapOptions);

        

        var marker = new google.maps.Marker({
            position: location,
            map: map,
            
            draggable: true
        });

        
        google.maps.event.addListener(marker, 'dragend', function(evt){
            document.getElementById('current').innerHTML = '<p>Marker dropped: Current Lat: ' + evt.latLng.lat().toFixed(3) + ' Current Lng: ' + evt.latLng.lng().toFixed(3) + '</p>';
        });

        google.maps.event.addListener(marker, 'dragstart', function(evt){
            document.getElementById('current').innerHTML = '<p>Currently dragging marker...</p>';
        });
        
    }
    


    google.maps.event.addDomListener(window, 'load', initMap);
});