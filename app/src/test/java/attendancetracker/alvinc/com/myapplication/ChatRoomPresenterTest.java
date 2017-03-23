package attendancetracker.alvinc.com.myapplication;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import attendancetracker.alvinc.com.myapplication.model.Member;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.spy;
import static org.powermock.api.mockito.PowerMockito.verifyStatic;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Member.class})
public class ChatRoomPresenterTest {

    private Member presenter;


    @Before
    public void setUp() throws Exception {
        presenter = mock(Member.class);
    }

    @Test
    public void onAttach() throws Exception {
    }

    @Test
    public void onDetach() throws Exception {
    }
}

