package activity;

public class ActivityWithTrack implements Activity{

    private ActivityType activityType;
    private Track track;

    public ActivityWithTrack(Track track, ActivityType activityType) {
        if (track == null) {
            throw new IllegalArgumentException("Track is null");
        }
        this.track = track;
        if (activityType == null) {
            throw new IllegalArgumentException("Activity type is null");
        }
        this.activityType = activityType;
    }

    @Override
    public double getDistance() {
        return track.getDistance();
    }

    @Override
    public ActivityType getType() {
        return activityType;
    }

}
