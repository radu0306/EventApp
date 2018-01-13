CREATE TABLE event(
	
eventId IDENTITY,
UID int,
name VARCHAR(50),
description VARCHAR(100),
tag VARCHAR(20),

CONSTRAINT pk_event_eventId PRIMARY KEY (eventId)
CONSTRAINT chk_Frequency CHECK (Frequency IN ('Natural_Disaster', 'Terrorist_Act', 'Accident'))

);

