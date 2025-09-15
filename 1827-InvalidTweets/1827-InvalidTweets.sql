-- Last updated: 15/09/2025, 19:34:08
# Write your MySQL query statement below
select tweet_id from Tweets
where length(content) > 15;