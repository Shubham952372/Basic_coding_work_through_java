from geopy.distance import geodesic

# Define the geofence coordinates (latitude and longitude).
geofence_center = (40.7128, -74.0060)  # Example coordinates for our classroom
geofence_radius = 5.0  # Radius in kilometers 

# Function to check if a location is within the geofence.
def is_within_geofence(current_location):
    distance = geodesic(geofence_center, current_location).kilometers
    return distance <= geofence_radius

# Function to get the user's current location (for demonstration purposes).
def get_user_location():
    # In a real application, you would obtain the user's location using appropriate methods (e.g., GPS or a mobile app).
    # For this example, we'll use fixed coordinates.
    return (40.7130, -74.0059)  # Example user coordinates

# Check if the user's location is within the geofence.
user_location = get_user_location()
if is_within_geofence(user_location):
    print("Attendance accepted. User is within the geofence.")
else:
    print("Attendance not accepted. User is outside the geofence.")
