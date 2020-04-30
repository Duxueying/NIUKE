package dao;

import common.JavaImageServerException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ImageDao {
    /**
     * �� image ������뵽���ݿ���
     * @param image
     */
    public void insert(Image image) throws SQLException {
        // 1. ��ȡ���ݿ�����
        Connection connection = DBUtil.getConnection();
        // 2. ������ƴװ SQL ���
        String sql = "insert into image_table values(null, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = null;
        try {//�����ʺ�
            statement = connection.prepareStatement(sql);
            statement.setString(1, image.getImageName());
            statement.setInt(2, image.getSize());
            statement.setString(3, image.getUploadTime());
            statement.setString(4, image.getContentType());
            statement.setString(5, image.getPath());
            statement.setString(6, image.getMd5());

            // 3. ִ�� SQL ���
            int ret = statement.executeUpdate();
            if (ret != 1) {
                // �����������, �׳�һ���쳣
                throw new JavaImageServerException("�������ݿ����!");
            }
        } catch (SQLException | JavaImageServerException e) {
            e.printStackTrace();
        } finally {
            // 4. �ر����Ӻ�statement����
            DBUtil.close(connection, statement, null);
        }
    }

    /**
     * �������ݿ��е�����ͼƬ����Ϣ
     * @return
     */
    public List<Image> selectAll() throws SQLException {
        List<Image> images = new ArrayList<>();
        // 1. ��ȡ���ݿ�����
        Connection connection = DBUtil.getConnection();
        // 2. ���� SQL ���
        String sql = "select * from image_table";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            // 3. ִ�� SQL ���
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();//��ȡ�����
            // 4. ��������
            while (resultSet.next()) {
                Image image = new Image();
                image.setImageId(resultSet.getInt("imageId"));
                image.setImageName(resultSet.getString("imageName"));
                image.setSize(resultSet.getInt("size"));
                image.setUploadTime(resultSet.getString("uploadTime"));
                image.setContentType(resultSet.getString("contentType"));
                image.setPath(resultSet.getString("path"));
                image.setMd5(resultSet.getString("md5"));
                images.add(image);
            }
            return images;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 5. �ر�����
            DBUtil.close(connection, statement, resultSet);
        }
        return null;
    }

    /**
     * ���� imageId ����ָ����ͼƬ��Ϣ
     * @param imageId
     * @return
     */
    public Image selectOne(int imageId) throws SQLException {
        // 1. ��ȡ���ݿ�����
        Connection connection = DBUtil.getConnection();
        // 2. ���� SQL ���
        String sql = "select * from image_table where imageId = ?";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            // 3. ִ�� SQL ���
            statement = connection.prepareStatement(sql);
            statement.setInt(1, imageId);
            resultSet = statement.executeQuery();
            // 4. ��������
            if (resultSet.next()) {
                Image image = new Image();
                image.setImageId(resultSet.getInt("imageId"));
                image.setImageName(resultSet.getString("imageName"));
                image.setSize(resultSet.getInt("size"));
                image.setUploadTime(resultSet.getString("uploadTime"));
                image.setContentType(resultSet.getString("contentType"));
                image.setPath(resultSet.getString("path"));
                image.setMd5(resultSet.getString("md5"));
                return image;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 5. �ر�����
            DBUtil.close(connection, statement, resultSet);
        }
        return null;
    }

    /**
     * ���� imageId ɾ��ָ����ͼƬ
     * @param imageId
     */
    public void delete(int imageId) throws SQLException {
        // 1. ��ȡ���ݿ�����
        Connection connection = DBUtil.getConnection();
        // 2. ƴװ SQL ���
        String sql = "delete from image_table where imageId = ?";
        PreparedStatement statement = null;
        // 3. ִ�� SQL ���
        try {
            statement = connection.prepareStatement(sql);
            statement.setInt(1, imageId);
            int ret = statement.executeUpdate();
            if (ret != 1) {
                throw new JavaImageServerException("ɾ�����ݿ����ʧ��");
            }
        } catch (SQLException | JavaImageServerException e) {
            e.printStackTrace();
        } finally {
            // 4. �ر�����
            DBUtil.close(connection, statement, null);
        }
    }

    // ��������ʪ�����ݿ����ڰ����Ʒ�������, ���ڱ���. ��������ڱ���ֱ�������޷��������ݿ�
    // �˴�����Ҫ������������Ʒ�������ִ�в��ܿ���Ч��
    // ��һ�� jar ��, �� jar ���������Ʒ�������, �Ϳ���ִ����
    public static void main(String[] args) throws SQLException {
        // ���ڽ��м򵥵Ĳ���
        // 1. ���Բ�������
       /*Image image = new Image();
       image.setImageName("1.png");
        image.setSize(100);
       image.setUploadTime("20200216");
        image.setContentType("image/png");
       image.setPath("./data/1.png");
        image.setMd5("11223344");
       ImageDao imageDao = new ImageDao();
        imageDao.insert(image);*/

        // 2. ���Բ�������ͼƬ��Ϣ
//        ImageDao imageDao = new ImageDao();
//        List<Image> images = imageDao.selectAll();
//        System.out.println(images);

        // 3. ���Բ���ָ��ͼƬ��Ϣ
//        ImageDao imageDao = new ImageDao();
//        Image image = imageDao.selectOne(1);
//        System.out.println(image);

        // 4. ����ɾ��ͼƬ
       ImageDao imageDao = new ImageDao();
        imageDao.delete(3);
    }

    public Image selectByMd5(String md5) throws SQLException {
        // 1. ��ȡ���ݿ�����
        Connection connection = DBUtil.getConnection();
        // 2. ���� SQL ���
        String sql = "select * from image_table where md5 = ?";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            // 3. ִ�� SQL ���
            statement = connection.prepareStatement(sql);
            statement.setString(1, md5);
            resultSet = statement.executeQuery();
            // 4. ��������
            if (resultSet.next()) {
                Image image = new Image();
                image.setImageId(resultSet.getInt("imageId"));
                image.setImageName(resultSet.getString("imageName"));
                image.setSize(resultSet.getInt("size"));
                image.setUploadTime(resultSet.getString("uploadTime"));
                image.setContentType(resultSet.getString("contentType"));
                image.setPath(resultSet.getString("path"));
                image.setMd5(resultSet.getString("md5"));
                return image;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 5. �ر�����
            DBUtil.close(connection, statement, resultSet);
        }
        return null;
    }
}
